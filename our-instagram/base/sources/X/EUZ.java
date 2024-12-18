package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class EUZ extends C1P1 {
    public View A00;
    public C1P1 A01;
    public final AbstractC59962oe A02;
    public final C07270a1 A03;
    public final EnumC31713DwI A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final /* synthetic */ LIA A08;

    public EUZ(View view, AbstractC59962oe abstractC59962oe, C1P1 c1p1, C07270a1 c07270a1, LIA lia, EnumC31713DwI enumC31713DwI, String str, String str2, boolean z) {
        this.A08 = lia;
        this.A03 = c07270a1;
        this.A05 = str;
        abstractC59962oe.getClass();
        this.A02 = abstractC59962oe;
        this.A04 = enumC31713DwI;
        this.A06 = str2;
        this.A00 = view;
        this.A01 = c1p1;
        this.A07 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) != false) goto L20;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EUZ.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(697253374);
        this.A01.onFail(abstractC115105If);
        C0f9.A0A(-989405580, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-695859316);
        this.A01.onFinish();
        C0f9.A0A(-122833426, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(964825274);
        this.A01.onStart();
        C0f9.A0A(-601067634, A03);
    }
}
