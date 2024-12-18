package X;

/* renamed from: X.6Cr, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Cr {
    public EnumC135896Cs A00 = EnumC135896Cs.A06;

    public final synchronized EnumC135896Cs A00(Integer num) {
        EnumC135896Cs enumC135896Cs;
        EnumC135896Cs enumC135896Cs2 = this.A00;
        if (enumC135896Cs2 instanceof C6Cu) {
            int intValue = num.intValue();
            if (intValue != 3) {
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(enumC135896Cs2);
                            sb.append(" can't accept: ");
                            sb.append(AbstractC225199wi.A00(num));
                            throw new IllegalStateException(sb.toString());
                        }
                        enumC135896Cs = EnumC135896Cs.A05;
                    }
                    enumC135896Cs = EnumC135896Cs.A07;
                }
                enumC135896Cs = EnumC135896Cs.A03;
            }
            enumC135896Cs = EnumC135896Cs.A04;
        } else if (enumC135896Cs2 instanceof C135906Ct) {
            int intValue2 = num.intValue();
            if (intValue2 != 3) {
                if (intValue2 != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(enumC135896Cs2);
                    sb2.append(" can't accept: ");
                    sb2.append(AbstractC225199wi.A00(num));
                    throw new IllegalStateException(sb2.toString());
                }
                enumC135896Cs = EnumC135896Cs.A09;
            }
            enumC135896Cs = EnumC135896Cs.A02;
        } else if (enumC135896Cs2 instanceof C135936Cy) {
            int intValue3 = num.intValue();
            if (intValue3 != 3 && intValue3 != 0) {
                if (intValue3 != 4) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(enumC135896Cs2);
                    sb3.append(" can't accept: ");
                    sb3.append(AbstractC225199wi.A00(num));
                    throw new IllegalStateException(sb3.toString());
                }
                enumC135896Cs = EnumC135896Cs.A02;
            }
            enumC135896Cs = EnumC135896Cs.A01;
        } else if (enumC135896Cs2 instanceof C135926Cx) {
            int intValue4 = num.intValue();
            if (intValue4 != 3 && intValue4 != 0) {
                if (intValue4 != 1) {
                    if (intValue4 != 2) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(enumC135896Cs2);
                        sb4.append(" can't accept: ");
                        sb4.append(AbstractC225199wi.A00(num));
                        throw new IllegalStateException(sb4.toString());
                    }
                    enumC135896Cs = EnumC135896Cs.A05;
                }
                enumC135896Cs = EnumC135896Cs.A08;
            }
            enumC135896Cs = EnumC135896Cs.A04;
        } else if (enumC135896Cs2 instanceof C135916Cw) {
            int intValue5 = num.intValue();
            if (intValue5 != 3) {
                if (intValue5 != 0) {
                    if (intValue5 != 2) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(enumC135896Cs2);
                        sb5.append(" can't accept: ");
                        sb5.append(AbstractC225199wi.A00(num));
                        throw new IllegalStateException(sb5.toString());
                    }
                    enumC135896Cs = EnumC135896Cs.A05;
                }
                enumC135896Cs = EnumC135896Cs.A07;
            }
            enumC135896Cs = EnumC135896Cs.A08;
        } else {
            if (enumC135896Cs2 instanceof C6D1) {
                int intValue6 = num.intValue();
                if (intValue6 != 3 && intValue6 != 0 && intValue6 != 2 && intValue6 != 4) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(enumC135896Cs2);
                    sb6.append(" can't accept: ");
                    sb6.append(AbstractC225199wi.A00(num));
                    throw new IllegalStateException(sb6.toString());
                }
            } else if (enumC135896Cs2 instanceof C6D0) {
                int intValue7 = num.intValue();
                if (intValue7 != 3) {
                    if (intValue7 != 0) {
                        if (intValue7 != 4) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(enumC135896Cs2);
                            sb7.append(" can't accept: ");
                            sb7.append(AbstractC225199wi.A00(num));
                            throw new IllegalStateException(sb7.toString());
                        }
                    }
                    enumC135896Cs = EnumC135896Cs.A05;
                }
                enumC135896Cs = EnumC135896Cs.A08;
            } else if (enumC135896Cs2 instanceof C135946Cz) {
                int intValue8 = num.intValue();
                if (intValue8 != 3 && intValue8 != 0) {
                    if (intValue8 != 4) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(enumC135896Cs2);
                        sb8.append(" can't accept: ");
                        sb8.append(AbstractC225199wi.A00(num));
                        throw new IllegalStateException(sb8.toString());
                    }
                }
                enumC135896Cs = EnumC135896Cs.A01;
            } else {
                int intValue9 = num.intValue();
                if (intValue9 != 3) {
                    if (intValue9 != 0) {
                        if (intValue9 != 1) {
                            if (intValue9 != 2) {
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append(enumC135896Cs2);
                                sb9.append(" can't accept: ");
                                sb9.append(AbstractC225199wi.A00(num));
                                throw new IllegalStateException(sb9.toString());
                            }
                            enumC135896Cs = EnumC135896Cs.A05;
                        }
                        enumC135896Cs = EnumC135896Cs.A07;
                    }
                    enumC135896Cs = EnumC135896Cs.A03;
                }
                enumC135896Cs = EnumC135896Cs.A04;
            }
            enumC135896Cs = EnumC135896Cs.A02;
        }
        this.A00 = enumC135896Cs;
        return enumC135896Cs;
    }
}
