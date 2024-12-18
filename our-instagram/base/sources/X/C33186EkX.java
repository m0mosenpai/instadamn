package X;

import android.os.Bundle;

/* renamed from: X.EkX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33186EkX extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "ContentDeepDiveDebugFragment";
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "content_deep_dive_debug_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1921095139);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getString("media_id", "Media Id Null");
        this.A01 = requireArguments.getString("media_eligibility", "Eligibility Null");
        String str = "prompts";
        this.A03 = requireArguments.getString("prompts", "Prompts Null");
        String string = requireArguments.getString("launcher_value", "Launcher value Null");
        this.A00 = string;
        C31335Dq0 c31335Dq0 = new C31335Dq0("Launcher Enabled:");
        if (string == null) {
            str = "cddEnabled";
        } else {
            C35246Fgf c35246Fgf = new C35246Fgf(string);
            c35246Fgf.A04 = new ViewOnClickListenerC35666Fp0(this, 68);
            C31335Dq0 c31335Dq02 = new C31335Dq0("Media ID");
            String str2 = this.A02;
            if (str2 == null) {
                str = "mediaId";
            } else {
                C35246Fgf c35246Fgf2 = new C35246Fgf(str2);
                c35246Fgf2.A04 = new ViewOnClickListenerC35666Fp0(this, 69);
                C31335Dq0 c31335Dq03 = new C31335Dq0("Media Eligibility:");
                String str3 = this.A01;
                if (str3 == null) {
                    str = "mediaEligibility";
                } else {
                    C35246Fgf c35246Fgf3 = new C35246Fgf(str3);
                    c35246Fgf3.A04 = new ViewOnClickListenerC35666Fp0(this, 70);
                    C31335Dq0 c31335Dq04 = new C31335Dq0("Prompts:");
                    String str4 = this.A03;
                    if (str4 != null) {
                        C35246Fgf c35246Fgf4 = new C35246Fgf(str4);
                        c35246Fgf4.A04 = ViewOnClickListenerC35685FpK.A00(this, 0);
                        setBottomSheetMenuItems(AbstractC16960so.A1Q(c31335Dq0, c35246Fgf, c31335Dq02, c35246Fgf2, c31335Dq03, c35246Fgf3, c31335Dq04, c35246Fgf4));
                        C0f9.A09(-794725551, A02);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
