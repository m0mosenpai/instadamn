package X;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.WpQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71179WpQ implements InterfaceC42241xE {
    public final int A00;
    public final Object A01;

    public C71179WpQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        WDF wdf;
        String str;
        C18920wW c18920wW;
        String str2;
        if (this.A00 != 0) {
            wdf = (WDF) this.A01;
            C68744VbN c68744VbN = wdf.A0F;
            str = wdf.A0G;
            C14360o3.A0B(str, 0);
            c18920wW = c68744VbN.A00;
            str2 = "armadillo_igd_group_profile_set_group_photo_remove_current_photo";
        } else {
            C68972VfA c68972VfA = ((C67994V5j) this.A01).A04;
            if (c68972VfA == null) {
                return;
            }
            wdf = c68972VfA.A01;
            C68744VbN c68744VbN2 = wdf.A0F;
            str = wdf.A0G;
            C14360o3.A0B(str, 0);
            c18920wW = c68744VbN2.A00;
            str2 = "armadillo_igd_group_profile_change_group_photo_confirmation";
        }
        AbstractC65703TsZ.A1M(c18920wW, str2, str);
        C0SG c0sg = (C0SG) wdf.A0B.A0Q(ReactProgressBarViewManager.PROP_PROGRESS);
        if (c0sg != null) {
            c0sg.A08();
        }
    }
}
