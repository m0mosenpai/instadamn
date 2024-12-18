package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsInsetBanner;
import com.instagram.igds.components.megaphone.IgdsPrismMegaphone;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.Oe3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55196Oe3 {
    public final Bitmap A00;
    public final UserSession A01;
    public final EnumC53317Nht A02;
    public final R1K A03;
    public final String A04;
    public final O8K A05;
    public final String A06;
    public final java.util.Set A07;

    public static final void A01(FragmentActivity fragmentActivity, C55196Oe3 c55196Oe3) {
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        HashMap A1G3 = AbstractC166987dD.A1G();
        BitSet bitSet = new BitSet(1);
        A1G.put("promo_id", c55196Oe3.A04);
        bitSet.set(0);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(c55196Oe3.A01);
        if (bitSet.nextClearBit(0) >= 1) {
            C66277U6x A02 = C66277U6x.A02("com.bloks.www.nme.contextual_guidance.ig.enhanced_linksheet.bottomsheet.nux", AbstractC191768eY.A01(A1G), A1G2);
            AbstractC31178DnM.A1M(A02, 719983200);
            A02.A03 = null;
            A02.A02 = null;
            A02.A04 = null;
            A02.A08(A1G3);
            A02.A05(fragmentActivity, A0C);
            return;
        }
        throw AbstractC166987dD.A14("Missing Required Props");
    }

    public static void A03(C5SU c5su, C55196Oe3 c55196Oe3, Object obj) {
        c5su.A0A = true;
        c5su.A04 = new NMB(5, obj, c55196Oe3);
        c5su.A00().A07(c55196Oe3.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View A05(Context context) {
        IgdsPrismMegaphone igdsPrismMegaphone;
        IgdsPrismMegaphone igdsPrismMegaphone2;
        C14360o3.A0B(context, 0);
        int ordinal = this.A02.ordinal();
        if (ordinal != 4) {
            if (ordinal != 6) {
                return null;
            }
            R1K r1k = this.A03;
            igdsPrismMegaphone2 = null;
            igdsPrismMegaphone2 = null;
            if (r1k.A0B(DialogModule.KEY_TITLE) != null || r1k.A0C("subtitle") != null) {
                igdsPrismMegaphone = new IgdsPrismMegaphone(context, (InterfaceC11380iw) null);
                String A0B = r1k.A0B(DialogModule.KEY_TITLE);
                String str = "";
                if (A0B == null) {
                    A0B = "";
                }
                igdsPrismMegaphone.setHeadline(A0B);
                String A0C = r1k.A0C("subtitle");
                if (A0C != null) {
                    str = A0C;
                }
                igdsPrismMegaphone.setBody(str);
                String optionalStringField = r1k.getOptionalStringField(6, "cta_text");
                if (optionalStringField != null) {
                    igdsPrismMegaphone.setPrimaryButton(optionalStringField, new ViewOnClickListenerC55468OkN(2, context, this));
                }
                igdsPrismMegaphone.setDismissListener(new C57518Pfs(this, 31));
                C60008QsU A0E = r1k.A0E();
                if (A0E != null && A0E.getOptionalStringField(0, "uri") != null) {
                    Bitmap bitmap = this.A00;
                    if (bitmap != null) {
                        igdsPrismMegaphone.setIllustrationDrawable(AbstractC43593JPy.A0A(context, bitmap), EnumC53118NeV.A03, EnumC53136Nep.A04);
                    }
                }
                A04(this, "IMPRESSION");
                igdsPrismMegaphone2 = igdsPrismMegaphone;
            }
        } else {
            R1K r1k2 = this.A03;
            igdsPrismMegaphone = null;
            if (r1k2.A0C("subtitle") != null) {
                IgdsInsetBanner igdsInsetBanner = new IgdsInsetBanner(context, null, 0, 0);
                igdsInsetBanner.setBody(r1k2.A0C("subtitle"), false);
                if (r1k2.getOptionalStringField(6, "cta_text") != null) {
                    igdsInsetBanner.setAction(r1k2.getOptionalStringField(6, "cta_text"));
                }
                igdsInsetBanner.A00 = new C56402P2p(1, this, context);
                C60008QsU A0E2 = r1k2.A0E();
                if (A0E2 != null && A0E2.getOptionalStringField(0, "uri") != null) {
                    Bitmap bitmap2 = this.A00;
                    if (bitmap2 != null) {
                        igdsInsetBanner.setIconEnd(AbstractC43593JPy.A0A(context, bitmap2));
                    }
                }
                igdsInsetBanner.setDismissible(true);
                A04(this, "IMPRESSION");
                igdsPrismMegaphone2 = igdsInsetBanner;
            }
            igdsPrismMegaphone2 = igdsPrismMegaphone;
        }
        return igdsPrismMegaphone2;
    }

    public final void A07(FragmentActivity fragmentActivity) {
        C14360o3.A0B(fragmentActivity, 0);
        int ordinal = this.A02.ordinal();
        if (ordinal != 9) {
            if (ordinal != 3) {
                if (ordinal == 2) {
                    R1K r1k = this.A03;
                    if (r1k.hasFieldValue("is_bloks") && r1k.getCoercedBooleanField(9, "is_bloks")) {
                        A01(fragmentActivity, this);
                        return;
                    } else {
                        A02(fragmentActivity, this);
                        return;
                    }
                }
                return;
            }
            throw AbstractC166987dD.A12("Tooltip show config is required for tooltip");
        }
        throw AbstractC166987dD.A12("Tooltip show config is required for tooltip");
    }

    public static final void A00(Context context, C55196Oe3 c55196Oe3) {
        R1K r1k = c55196Oe3.A03;
        if (r1k.getOptionalStringField(7, "cta_url") != null) {
            A04(c55196Oe3, "CTA_CLICK");
            String optionalStringField = r1k.getOptionalStringField(7, "cta_url");
            if (optionalStringField == null) {
                optionalStringField = "";
            }
            AbstractC35275FhA.A05(context, optionalStringField);
        }
    }

    public static final void A02(FragmentActivity fragmentActivity, C55196Oe3 c55196Oe3) {
        R1K r1k = c55196Oe3.A03;
        if (r1k.A0B(DialogModule.KEY_TITLE) != null) {
            C60008QsU A0E = r1k.A0E();
            if (A0E != null && A0E.A07("uri") != null && c55196Oe3.A00 == null) {
                return;
            }
            Object obj = new Object();
            String A0B = r1k.A0B(DialogModule.KEY_TITLE);
            if (A0B == null) {
                A0B = "";
            }
            String A0C = r1k.A0C("subtitle");
            Bitmap bitmap = c55196Oe3.A00;
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString(DialogModule.KEY_TITLE, A0B);
            A0b.putString("body", A0C);
            A0b.putParcelable("illustration", bitmap);
            N4C n4c = new N4C();
            n4c.setArguments(A0b);
            C189448aO A0y = AbstractC25225BEi.A0y(c55196Oe3.A01);
            if (r1k.getOptionalStringField(6, "cta_text") != null) {
                A0y.A0g = r1k.getOptionalStringField(6, "cta_text");
                A0y.A1J = true;
                A0y.A0v = true;
                A0y.A0K = ViewOnClickListenerC55459OkE.A00(fragmentActivity, obj, c55196Oe3, 22);
            }
            A0y.A0U = new C56758PHa(5, c55196Oe3, obj);
            A04(c55196Oe3, "IMPRESSION");
            AbstractC31173DnH.A0w(fragmentActivity, n4c, A0y);
        }
    }

    public static final void A04(C55196Oe3 c55196Oe3, String str) {
        if (c55196Oe3.A07.add(str)) {
            O8K o8k = c55196Oe3.A05;
            String str2 = c55196Oe3.A04;
            String str3 = c55196Oe3.A06;
            Enum optionalEnumField = c55196Oe3.A03.getOptionalEnumField(3, "entry_flow", EnumC53294NhW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            AbstractC166987dD.A1Z(new D50(o8k, optionalEnumField, str, str2, str3, null, 6), o8k.A01);
        }
    }

    public final EnumC53313Nhp A06() {
        return (EnumC53313Nhp) this.A03.getOptionalEnumField(2, "anchor", EnumC53313Nhp.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final boolean A08() {
        R1K r1k = this.A03;
        if (r1k.hasFieldValue("is_pseudo_for_deferred_exposure") && r1k.getCoercedBooleanField(10, "is_pseudo_for_deferred_exposure")) {
            return true;
        }
        return false;
    }

    public C55196Oe3(Bitmap bitmap, UserSession userSession, EnumC53317Nht enumC53317Nht, O8K o8k, R1K r1k, String str, String str2) {
        AbstractC25234BEr.A1P(str, enumC53317Nht, r1k);
        C14360o3.A0B(o8k, 6);
        this.A04 = str;
        this.A02 = enumC53317Nht;
        this.A06 = str2;
        this.A03 = r1k;
        this.A00 = bitmap;
        this.A05 = o8k;
        this.A01 = userSession;
        this.A07 = AbstractC31171DnF.A0l();
    }
}
