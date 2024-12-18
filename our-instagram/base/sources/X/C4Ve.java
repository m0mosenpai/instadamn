package X;

/* renamed from: X.4Ve, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4Ve {
    public static final void A00(AnonymousClass306 anonymousClass306, InterfaceC686036x interfaceC686036x, Object obj, Object obj2, int i) {
        anonymousClass306.A7b(i, obj, obj2);
        if (i != EnumC65592xv.A0l.ordinal() && i != EnumC65592xv.A0j.ordinal() && i != EnumC65592xv.A0S.ordinal() && i != EnumC65592xv.A0O.ordinal() && i != EnumC65592xv.A0Z.ordinal() && i != EnumC65592xv.A0b.ordinal()) {
            int ordinal = EnumC65592xv.A0v.ordinal();
            InterfaceC75403a7 BS6 = interfaceC686036x.BS6();
            if (i == ordinal) {
                BS6.A8A((C79233gU) obj2, i);
                return;
            } else {
                BS6.AAH(i);
                return;
            }
        }
        interfaceC686036x.BS6().A8D(i);
    }

    public static final void A01(AnonymousClass306 anonymousClass306, InterfaceC686036x interfaceC686036x, Object obj, Object obj2, int i) {
        InterfaceC75403a7 BS6;
        EnumC65592xv enumC65592xv;
        anonymousClass306.A7b(i, obj, obj2);
        if (i != EnumC65592xv.A0l.ordinal() && i != EnumC65592xv.A0S.ordinal()) {
            if (i != EnumC65592xv.A0k.ordinal() && i != EnumC65592xv.A0j.ordinal()) {
                if (i == EnumC65592xv.A0O.ordinal()) {
                    interfaceC686036x.BS6().AAH(i);
                    BS6 = interfaceC686036x.BS6();
                } else {
                    if (i != EnumC65592xv.A0Z.ordinal()) {
                        return;
                    }
                    interfaceC686036x.BS6().AAH(i);
                    BS6 = interfaceC686036x.BS6();
                    if (!((C38321qM) obj).A5M()) {
                        enumC65592xv = EnumC65592xv.A0w;
                        BS6.A87(enumC65592xv.ordinal());
                        return;
                    }
                }
                enumC65592xv = EnumC65592xv.A0B;
                BS6.A87(enumC65592xv.ordinal());
                return;
            }
            interfaceC686036x.BS6().AAH(i);
            interfaceC686036x.BS6().A8D(i);
            return;
        }
        interfaceC686036x.BS6().AAH(i);
        interfaceC686036x.BS6().A8D(EnumC65592xv.A0w.ordinal());
    }
}
