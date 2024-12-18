package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kke, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46661Kke {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final Reel A00(UserSession userSession, C44954Jv6 c44954Jv6, String str, int i) {
        ImmutableList A02;
        AbstractC907342m abstractC907342m;
        SimpleImageUrl simpleImageUrl;
        SimpleImageUrl simpleImageUrl2;
        List list;
        List list2;
        C37771pE c37771pE;
        String str2;
        boolean z;
        String optString;
        ImmutableList A03;
        ImmutableList A032;
        AbstractC907342m A00;
        String A05;
        String A052;
        AbstractC907342m A002 = c44954Jv6.A00(C44953Jv5.class, "ar_effects");
        if (A002 != null && (A02 = A002.A02("effects_by_id", C44952Jv4.class)) != null && (abstractC907342m = (AbstractC907342m) AbstractC001800i.A0J(A02)) != null) {
            AbstractC907342m A003 = abstractC907342m.A00(C44951Jv3.class, "thumbnail_image");
            String str3 = null;
            if (A003 != null && (A052 = A003.A05("uri")) != null) {
                simpleImageUrl = AbstractC81033jX.A00(AbstractC25227BEk.A0B(A052), -1, -1);
            } else {
                simpleImageUrl = null;
            }
            AbstractC907342m A004 = abstractC907342m.A00(C44948Jv0.class, "attribution_user");
            if (A004 != null && (A00 = A004.A00(C44947Juz.class, "profile_picture")) != null && (A05 = A00.A05("uri")) != null) {
                simpleImageUrl2 = AbstractC81033jX.A00(AbstractC25227BEk.A0B(A05), -1, -1);
            } else {
                simpleImageUrl2 = null;
            }
            AbstractC907342m A005 = abstractC907342m.A00(C44949Jv1.class, "effect_action_sheet");
            if (A005 != null && (A032 = A005.A03("primary_actions", EnumC174177p9.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) != null) {
                list = AbstractC167007dF.A0i(A032);
                Iterator it = A032.iterator();
                while (it.hasNext()) {
                    AbstractC166997dE.A1S(it.next(), list);
                }
            } else {
                list = C16930sl.A00;
            }
            AbstractC907342m A006 = abstractC907342m.A00(C44949Jv1.class, "effect_action_sheet");
            if (A006 != null && (A03 = A006.A03("secondary_actions", EnumC174177p9.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) != null) {
                list2 = AbstractC167007dF.A0i(A03);
                Iterator it2 = A03.iterator();
                while (it2.hasNext()) {
                    AbstractC166997dE.A1S(it2.next(), list2);
                }
            } else {
                list2 = C16930sl.A00;
            }
            AbstractC907342m A007 = abstractC907342m.A00(C44950Jv2.class, "media");
            if (A007 != null && (optString = A007.A00.optString("preview_video")) != null) {
                c37771pE = AbstractC38741r6.parseFromJson(C07950bF.A04.A01(userSession, optString));
            } else {
                c37771pE = AbstractC37741pB.A00;
            }
            Reel A0I = C1OU.A04(userSession).A0I(c37771pE, false);
            String A053 = abstractC907342m.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            if (A053 == null) {
                A053 = AbstractC167017dG.A0j();
            }
            String A054 = abstractC907342m.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (A054 == null) {
                A054 = "";
            }
            AbstractC907342m A008 = abstractC907342m.A00(C44948Jv0.class, "attribution_user");
            if (A008 != null) {
                str2 = A008.A05(AbstractC31190DnZ.A00());
            } else {
                str2 = null;
            }
            AbstractC907342m A009 = abstractC907342m.A00(C44948Jv0.class, "attribution_user");
            if (A009 != null) {
                str3 = A009.A05("instagram_user_id");
            }
            Enum A04 = abstractC907342m.A04(AbstractC111324zv.A00(1244), EnumC174267pI.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            if (A04 != null) {
                z = A04.equals(EnumC174267pI.SAVED);
            } else {
                z = false;
            }
            A0I.A0G = new AttributedAREffect(simpleImageUrl, simpleImageUrl2, null, null, A053, A054, str2, str3, null, str, null, list, list2, null, i, z);
            return A0I;
        }
        return null;
    }
}
