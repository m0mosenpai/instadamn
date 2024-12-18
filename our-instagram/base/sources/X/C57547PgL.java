package X;

import android.view.View;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.PgL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57547PgL extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57547PgL(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C57547PgL(obj, i));
    }

    public static InterfaceC09390do A01(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C57547PgL(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i;
        switch (this.A00) {
            case 1:
                return AbstractC166997dE.A0S(((PJ0) this.A01).A04.requireView(), R.id.iglive_reactions_composer);
            case 2:
                return AbstractC166997dE.A0S(((PJ0) this.A01).A04.requireView(), R.id.iglive_reactions_shadow_bottom);
            case 3:
                return C3PW.A00((View) this.A01, R.id.iglive_pinned_comment_stub);
            case 4:
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51362MmN(MSZ.A0J(((AbstractC52821NZe) this.A01).A04));
            case 5:
            case 8:
            case 11:
            case 23:
            case 26:
            case 31:
            case 36:
            case 44:
                return this.A01;
            case 6:
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 24:
            case 27:
            case 32:
            case 37:
            case 45:
                return AbstractC25226BEj.A1C(this.A01);
            case 7:
            case 10:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 25:
            case 28:
            case 33:
            case 38:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 14:
                N7s n7s = (N7s) this.A01;
                if (n7s instanceof C52824NZh) {
                    int i3 = ((C52824NZh) n7s).A00;
                    if (Integer.valueOf(i3) != null) {
                        return AbstractC31173DnH.A0E(AbstractC31171DnF.A07(n7s.requireView(), R.id.recycler_null_state_view_stub), i3);
                    }
                    return null;
                }
                return null;
            case Process.SIGTERM /* 15 */:
                N7s n7s2 = (N7s) this.A01;
                if (!(n7s2 instanceof C52823NZg)) {
                    return AbstractC31173DnH.A0E(AbstractC31171DnF.A07(n7s2.requireView(), R.id.recycler_bottom_view_stub), R.layout.layout_iglive_bottom_button).findViewById(R.id.bottom_button_layout);
                }
                return null;
            case 16:
                N7s n7s3 = (N7s) this.A01;
                if (n7s3 instanceof C52826NZj) {
                    i = ((C52826NZj) n7s3).A00;
                } else if (n7s3 instanceof C52824NZh) {
                    i = ((C52824NZh) n7s3).A01;
                } else if (n7s3 instanceof C52825NZi) {
                    i = ((C52825NZi) n7s3).A00;
                } else {
                    return null;
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf != null) {
                    return AbstractC31173DnH.A0E(AbstractC31171DnF.A07(n7s3.requireView(), R.id.recycler_top_view_stub), valueOf.intValue());
                }
                return null;
            case 17:
                return AbstractC166997dE.A0S((View) this.A01, R.id.iglive_reactions_comments);
            case 18:
                return AbstractC166997dE.A0S((View) this.A01, R.id.iglive_reactions_composer);
            case Process.SIGSTOP /* 19 */:
                return AbstractC166997dE.A0S((View) this.A01, R.id.iglive_reactions_extensions);
            case 20:
                return AbstractC166997dE.A0S((View) this.A01, R.id.iglive_header_avatar_text_container);
            case 21:
                return AbstractC166997dE.A0S((View) this.A01, R.id.iglive_header_close);
            case 22:
                return AbstractC166997dE.A0S((View) this.A01, R.id.iglive_header_options);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return ((View) this.A01).findViewById(R.id.comment_composer_options_button);
            case 30:
                return ((View) this.A01).findViewById(R.id.comment_composer_post_button);
            case 34:
                C56162OwU c56162OwU = (C56162OwU) this.A01;
                AbstractC59962oe abstractC59962oe = c56162OwU.A08;
                return new NDH(abstractC59962oe.getContext(), abstractC59962oe, c56162OwU.A09, c56162OwU.A0C);
            case 35:
                return C3PW.A00(((OE8) this.A01).A00, R.id.iglive_capture_debug_textview);
            case 39:
                OE8 oe8 = (OE8) this.A01;
                return new NCB(oe8.A01, oe8.A02);
            case 40:
                View findViewById = AbstractC167007dF.A0L(((C56178Owl) this.A01).A05).findViewById(R.id.action_button);
                AbstractC56952jT.A01(findViewById);
                return findViewById;
            case Seq.NULL_REFNUM /* 41 */:
                return AbstractC167007dF.A0L(((C56178Owl) this.A01).A05).findViewById(R.id.description);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return AbstractC167007dF.A0L(((C56178Owl) this.A01).A05).findViewById(R.id.pinned_content_divider);
            case 43:
                View view = (View) this.A01;
                View findViewById2 = view.findViewById(R.id.iglive_pinned_content);
                if (findViewById2 != null) {
                    return findViewById2;
                }
                return AbstractC43594JPz.A0F(view, R.id.iglive_pinned_content_stub);
            case 47:
                return AbstractC167007dF.A0L(((C56178Owl) this.A01).A05).findViewById(R.id.title);
            case 48:
                return ((View) this.A01).findViewById(R.id.donation_amount);
            case 49:
                return C3PW.A00((View) this.A01, R.id.profile_emoji_overlay_stub);
        }
    }
}
