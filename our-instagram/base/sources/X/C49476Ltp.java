package X;

/* renamed from: X.Ltp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49476Ltp implements GZA {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C49476Ltp(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.GZA
    public final void onActionClicked() {
        switch (this.A00) {
            case 0:
                C166667cc c166667cc = (C166667cc) ((KBW) this.A02).A09.getValue();
                C21C c21c = c166667cc.A01.A05.A02.A01;
                c21c.A01();
                C167417dv c167417dv = c166667cc.A00;
                Integer num = C05F.A0C;
                String str = c166667cc.A05;
                InterfaceC19630xq interfaceC19630xq = c21c.A00;
                c167417dv.A00(num, str, AbstractC31175DnJ.A03(interfaceC19630xq, AnonymousClass001.A0R("key_suggested_sticker_hint_impression_count", "COMMENTS")), AbstractC31175DnJ.A03(interfaceC19630xq, AnonymousClass001.A0R("key_suggested_sticker_cool_down_phase", "COMMENTS")));
                AbstractC43593JPy.A1Q(this.A01);
                return;
            case 1:
                ((AbstractC46509Ki8) this.A01).A00();
                ((MQZ) this.A02).Daq();
                return;
            case 2:
                C43626JRj c43626JRj = (C43626JRj) this.A02;
                C63397SjR A0y = AbstractC25228BEl.A0y(c43626JRj.A04, c43626JRj.A0B, C2Fb.A1W, "https://www.facebook.com/help/instagram/475931443650619");
                A0y.A0S = "direct_inbox_general_folder_banner";
                A0y.A0A();
                return;
            case 3:
                C47243KuG c47243KuG = ((C45626KHp) this.A02).A00;
                if (c47243KuG == null || !C14360o3.A0K(((C48319LZs) this.A01).A06, "onboard_banner_start_button_tag")) {
                    return;
                }
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(c47243KuG.A00.A09);
                MCD.A02(A0Z, AbstractC141776au.A00(A0Z), 41);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e2, code lost:
    
        if (r5 == X.EnumC44025JdC.A0E) goto L28;
     */
    @Override // X.GZA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBannerDismissed() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49476Ltp.onBannerDismissed():void");
    }
}
