package me.rexim.morganey.church.numbers

import me.rexim.morganey.ast.{LambdaApp, LambdaFunc, LambdaVar, LambdaTerm}

object ChurchPairConverter {
  // (λ z . ((z x) y))
  def convertPair(pair: LambdaTerm): Option[(LambdaTerm, LambdaTerm)] =
    pair match {
      case LambdaFunc(LambdaVar(cons),
        LambdaApp(LambdaApp(LambdaVar(cons1), car), cdr)
      ) if cons == cons1 => Some((car, cdr))

      case _ => None
    }

  def convertList(list: LambdaTerm): Option[List[LambdaTerm]] =
    ???
}
