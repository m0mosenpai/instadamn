package X;

import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.CrW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29043CrW implements C2YT {
    public final EnumC99714dp A00;
    public final EnumC99704do A01;
    public final String A02;

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        IgdsButton igdsButton = (IgdsButton) AbstractC25228BEl.A0Q(c2yr, C26635BpW.A05);
        igdsButton.setStyle(this.A01);
        igdsButton.setSize(this.A00);
        String str = this.A02;
        if (str != null) {
            igdsButton.setText(str);
        }
        igdsButton.A02(EnumC99774dy.A02, 0);
        igdsButton.setElevated(false);
        return AbstractC25234BEr.A0Q(igdsButton, j);
    }

    public C29043CrW(EnumC99714dp enumC99714dp, EnumC99704do enumC99704do, String str) {
        AbstractC167017dG.A1P(enumC99704do, enumC99714dp);
        this.A01 = enumC99704do;
        this.A00 = enumC99714dp;
        this.A02 = str;
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
