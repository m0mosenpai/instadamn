package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.NpD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53724NpD {
    public static final void A00(Fragment fragment, String str) {
        String str2;
        OVR ovr = OVR.A00;
        String str3 = (String) OVR.A03.A0R();
        if (str3 == null || (str2 = (String) AbstractC001800i.A0I(AbstractC001900j.A0Q(str3, new char[]{'$'}, 0))) == null) {
            str2 = "null";
        }
        ovr.A00(str2, AbstractC166987dD.A18(AnonymousClass001.A11("Prompt display parameter for ", str, " of ", str2, " is not available")));
        AbstractC25231BEo.A16(fragment);
    }
}
