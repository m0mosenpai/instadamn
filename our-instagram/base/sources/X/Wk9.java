package X;

/* loaded from: classes11.dex */
public final class Wk9 implements InterfaceC101554hQ {
    public final int A00;
    public final Object A01;

    public Wk9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC101554hQ
    public final void DXz() {
        String str;
        C30E c30e;
        switch (this.A00) {
            case 0:
                InterfaceC09390do interfaceC09390do = ((C45503KCs) this.A01).A0E;
                if (((C30E) interfaceC09390do.getValue()).A0G() == null) {
                    return;
                }
                c30e = (C30E) interfaceC09390do.getValue();
                c30e.A0U("peek");
                return;
            case 1:
                c30e = ((C70908WkB) this.A01).A08;
                if (c30e.A0G() == null) {
                    return;
                }
                c30e.A0U("peek");
                return;
            case 2:
                JIG jig = ((V1R) this.A01).A0A;
                if (jig != null) {
                    jig.E3f("peek");
                    return;
                }
                str = "videoPlayerManager";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                AbstractC67878V0j abstractC67878V0j = (AbstractC67878V0j) this.A01;
                JIG jig2 = abstractC67878V0j.A08;
                if (jig2 != null) {
                    jig2.EoV("peek", true);
                    JIG jig3 = abstractC67878V0j.A07;
                    if (jig3 == null) {
                        str = "hcmVideoPlayerManager";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    jig3.EoV("peek", true);
                    return;
                }
                str = "videoPlayerManager";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                JIG jig4 = ((C38934HCh) this.A01).A06;
                if (jig4 != null) {
                    jig4.EoV("peek", true);
                    return;
                }
                str = "videoPlayerManager";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    @Override // X.InterfaceC101554hQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DY1() {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L29;
                case 1: goto L42;
                case 2: goto L17;
                case 3: goto L22;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.A01
            X.HCh r0 = (X.C38934HCh) r0
            X.Tug r0 = r0.A03
        Lb:
            if (r0 != 0) goto L52
            java.lang.String r0 = "grid"
        Lf:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L17:
            java.lang.Object r0 = r2.A01
            X.V1R r0 = (X.V1R) r0
            X.JIG r0 = r0.A0A
            if (r0 != 0) goto L58
            java.lang.String r0 = "videoPlayerManager"
            goto Lf
        L22:
            java.lang.Object r0 = r2.A01
            X.V0j r0 = (X.AbstractC67878V0j) r0
            X.Tug r0 = r0.A06
            goto Lb
        L29:
            java.lang.Object r0 = r2.A01
            X.KCs r0 = (X.C45503KCs) r0
            X.0do r1 = r0.A0E
            java.lang.Object r0 = r1.getValue()
            X.30E r0 = (X.C30E) r0
            X.1qM r0 = r0.A0G()
            if (r0 == 0) goto L57
            java.lang.Object r1 = r1.getValue()
            X.30E r1 = (X.C30E) r1
            goto L4e
        L42:
            java.lang.Object r0 = r2.A01
            X.WkB r0 = (X.C70908WkB) r0
            X.30E r1 = r0.A08
            X.1qM r0 = r1.A0G()
            if (r0 == 0) goto L57
        L4e:
            r1.A0M()
            return
        L52:
            X.JI3 r0 = r0.A0D
            r0.EJ1()
        L57:
            return
        L58:
            r0.EKj()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Wk9.DY1():void");
    }
}
