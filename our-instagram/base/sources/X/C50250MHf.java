package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.MHf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50250MHf extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50250MHf(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C50250MHf(obj, i));
    }

    public static C50250MHf A01(Object obj, int i) {
        return new C50250MHf(obj, i);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        EnumC44072Jdx enumC44072Jdx;
        switch (this.A00) {
            case 0:
            case 7:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 28:
            case 33:
            case 37:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return this.A01;
            case 1:
            case 8:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 34:
            case 38:
            case 47:
                return AbstractC25226BEj.A1C(this.A01);
            case 2:
            case 9:
            case 14:
            case 30:
            case 35:
            case 39:
            case 48:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 3:
                KYg kYg = (KYg) this.A01;
                return new KGA((LLN) kYg.A01.getValue(), kYg.A06(), LAu.A01(kYg).A01);
            case 4:
                return new C47241KuE(((C44550Jmu) this.A01).A03);
            case 5:
                ((KI9) this.A01).A03.invoke();
                break;
            case 6:
                return new C27V((UserSession) this.A01);
            case 10:
                KC4 kc4 = (KC4) this.A01;
                Bundle requireArguments = kc4.requireArguments();
                FragmentActivity requireActivity = kc4.requireActivity();
                UserSession A0r = AbstractC166987dD.A0r(kc4.A0A);
                Parcelable parcelable = requireArguments.getParcelable("arg_appreciation_logging_fan_data");
                if (parcelable != null) {
                    return new C45605KGt(requireActivity, (LoggingFanData) parcelable, kc4, A0r, AbstractC153636vY.A01(requireArguments, "arg_buy_and_send_creator_name"), AbstractC153636vY.A01(requireArguments, "arg_buy_and_send_gif_url"), requireArguments.getInt("arg_buy_and_send_balance"), requireArguments.getInt("arg_buy_and_send_gift_price"));
                }
                throw AbstractC166997dE.A0g();
            case 11:
                C45521KDm c45521KDm = (C45521KDm) this.A01;
                String A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(c45521KDm), 2131965052);
                SpannableStringBuilder A09 = AbstractC31178DnM.A09(AbstractC166997dE.A0q(AbstractC166997dE.A0N(c45521KDm), 2131953040), A0q);
                C46067KaO c46067KaO = new C46067KaO(c45521KDm, AbstractC25233BEq.A04(c45521KDm));
                C14360o3.A0A(A09);
                AnonymousClass773.A04(A09, c46067KaO, A0q);
                Integer valueOf = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                return new C70795Wh8(A09, valueOf, valueOf, null, null, C05F.A0C, null, R.style.PrivacyTextStyle);
            case Process.SIGTERM /* 15 */:
                C45521KDm c45521KDm2 = (C45521KDm) this.A01;
                Bundle requireArguments2 = c45521KDm2.requireArguments();
                int i = requireArguments2.getInt("ext_balance");
                FragmentActivity requireActivity2 = c45521KDm2.requireActivity();
                UserSession A0r2 = AbstractC166987dD.A0r(c45521KDm2.A05);
                Parcelable parcelable2 = requireArguments2.getParcelable("arg_appreciation_logging_fan_data");
                if (parcelable2 != null) {
                    return new C45590KGe(requireActivity2, (LoggingFanData) parcelable2, c45521KDm2, A0r2, i);
                }
                throw AbstractC166997dE.A0g();
            case 16:
            case 17:
                ((L97) this.A01).A02.A01();
                break;
            case 18:
                return new C48504Lcv((L97) this.A01, C12L.A00);
            case Process.SIGSTOP /* 19 */:
                Fragment fragment = (Fragment) this.A01;
                String A0v = AbstractC25227BEk.A0v(fragment, 2131953055);
                Integer valueOf2 = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                return new C70795Wh8(A0v, valueOf2, valueOf2, valueOf2, valueOf2, C05F.A0C, Integer.valueOf(AbstractC31180DnO.A01(fragment)), R.style.PrivacyTextStyle);
            case 20:
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((C45525KDq) this.A01).A09);
                MCD.A02(A0Z, AbstractC141776au.A00(A0Z), 41);
                break;
            case 21:
                C45525KDq c45525KDq = (C45525KDq) this.A01;
                Bundle requireArguments3 = c45525KDq.requireArguments();
                UserSession A0r3 = AbstractC166987dD.A0r(c45525KDq.A08);
                String str = c45525KDq.A00;
                String A01 = AbstractC153636vY.A01(requireArguments3, "arg_media_id");
                String A012 = AbstractC153636vY.A01(requireArguments3, "arg_creator_id");
                String string = requireArguments3.getString("arg_entry_point");
                if (string == null) {
                    string = "unknown";
                }
                C47983LJh c47983LJh = new C47983LJh(new C26069Bfx(str, A01, A012, string, 5), c45525KDq, A0r3);
                C47983LJh.A02(C47983LJh.A01(c47983LJh, C05F.A0j, C05F.A05), c47983LJh);
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                if (new BitSet(0).nextClearBit(0) >= 0) {
                    C63719SsZ c63719SsZ = new C63719SsZ("com.bloks.www.screen_query.BloksStarsIGCreatorXarInfoScreenQuery", null, null, AbstractC06930Yk.A0B(A1I), AbstractC06930Yk.A0E(), 719983200, 0L, true);
                    AnonymousClass637 A00 = VRA.A00(C023409i.A0A.A05(c45525KDq.requireContext()), false);
                    Context requireContext = c45525KDq.requireContext();
                    WTZ wtz = new WTZ(null, null, null, null, 1.0f, false, false, false, true);
                    C14360o3.A0B(A00, 1);
                    c63719SsZ.E2V(requireContext, wtz, A00);
                    break;
                } else {
                    throw AbstractC166987dD.A14("Missing required params");
                }
            case 22:
                Fragment fragment2 = (Fragment) this.A01;
                String A0v2 = AbstractC25227BEk.A0v(fragment2, 2131953061);
                Integer valueOf3 = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                return new C70795Wh8(A0v2, valueOf3, Integer.valueOf(R.dimen.abc_button_padding_horizontal_material), valueOf3, valueOf3, C05F.A00, Integer.valueOf(AbstractC53242c7.A07(fragment2.getContext())), R.style.igds_emphasized_label);
            case 23:
                Fragment fragment3 = (Fragment) this.A01;
                String A0v3 = AbstractC25227BEk.A0v(fragment3, 2131953065);
                Integer valueOf4 = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                return new C70795Wh8(A0v3, valueOf4, valueOf4, valueOf4, valueOf4, C05F.A0C, Integer.valueOf(AbstractC31180DnO.A01(fragment3)), R.style.PrivacyTextStyle);
            case 24:
                return new C47243KuG((C45525KDq) this.A01);
            case 25:
                return new KJ6(Integer.valueOf(AbstractC166997dE.A0N((Fragment) this.A01).getDimensionPixelSize(R.dimen.achievements_list_container_height)), true);
            case 26:
                return new KJ6(Integer.valueOf(AbstractC25235BEs.A04(AbstractC31172DnG.A07(this.A01))), true);
            case 27:
                return AbstractC166987dD.A1J(new KJ6(Integer.valueOf((int) (AbstractC13890nF.A00(AbstractC31172DnG.A07(this.A01)) * 0.4f)), true));
            case 31:
                C45525KDq c45525KDq2 = (C45525KDq) this.A01;
                Bundle requireArguments4 = c45525KDq2.requireArguments();
                String str2 = c45525KDq2.A00;
                String A013 = AbstractC153636vY.A01(requireArguments4, "arg_media_id");
                String A014 = AbstractC153636vY.A01(requireArguments4, "arg_creator_id");
                String string2 = requireArguments4.getString("arg_entry_point");
                if (string2 == null) {
                    string2 = "unknown";
                }
                return new KGB(new C26069Bfx(str2, A013, A014, string2, 5), c45525KDq2, AbstractC166987dD.A0r(c45525KDq2.A08));
            case 32:
                return new C47244KuH((C45522KDn) this.A01);
            case 36:
                C45522KDn c45522KDn = (C45522KDn) this.A01;
                Bundle requireArguments5 = c45522KDn.requireArguments();
                return new C45599KGn(c45522KDn.requireActivity(), c45522KDn, AbstractC166987dD.A0r(c45522KDn.A07), AbstractC153636vY.A01(requireArguments5, "arg_gifting_media_id"), AbstractC153636vY.A01(requireArguments5, "arg_gifting_creator_id"), AbstractC153636vY.A01(requireArguments5, "arg_gifting_entry_point"));
            case 40:
                AbstractC45514KDf abstractC45514KDf = (AbstractC45514KDf) this.A01;
                return new C8SF(abstractC45514KDf.requireContext(), AbstractC166987dD.A0r(abstractC45514KDf.A03), C05F.A00, AbstractC167027dH.A01(abstractC45514KDf.A02), AbstractC167027dH.A01(abstractC45514KDf.A01), true);
            case Seq.NULL_REFNUM /* 41 */:
                K9K k9k = (K9K) this.A01;
                Context requireContext2 = k9k.requireContext();
                C08790ch A002 = AbstractC018607g.A00(k9k);
                Object value = k9k.A01.getValue();
                C14360o3.A0B(value, 2);
                return new KGU(0, requireContext2, A002, value);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                UserSession userSession = ((C44446JlD) this.A01).A02;
                C06090Tz c06090Tz = C06090Tz.A05;
                List A003 = AbstractC44073Jdy.A00(C18U.A04(c06090Tz, userSession, 36880768207159657L));
                if (!A003.isEmpty()) {
                    return A003;
                }
                if (C18U.A06(c06090Tz, userSession, 36327533469448864L)) {
                    return AbstractC166987dD.A1J(EnumC44072Jdx.A02);
                }
                C14360o3.A0B(userSession, 0);
                EnumC44072Jdx[] enumC44072JdxArr = new EnumC44072Jdx[2];
                if (C18U.A06(c06090Tz, userSession, 36327533469317790L)) {
                    enumC44072JdxArr[0] = EnumC44072Jdx.A02;
                    enumC44072Jdx = EnumC44072Jdx.A04;
                } else {
                    enumC44072JdxArr[0] = EnumC44072Jdx.A04;
                    enumC44072Jdx = EnumC44072Jdx.A02;
                }
                enumC44072JdxArr[1] = enumC44072Jdx;
                return AbstractC16960so.A1Q(enumC44072JdxArr);
            case 43:
                String A04 = C18U.A04(C06090Tz.A05, ((L2J) this.A01).A02, 36880768207225194L);
                if (!AbstractC16830sb.A07("tile", "fit", "fill").contains(A04)) {
                    A04 = "fill";
                }
                return new JSONObject(AbstractC25233BEq.A0p("aspectRatio", A04, AbstractC166987dD.A1L("mediaType", "gif")));
            case 44:
                return AbstractC25235BEs.A0U(this.A01);
            case 45:
                return AbstractC31172DnG.A0C(this.A01).getDefaultViewModelProviderFactory();
            case 49:
                return new KFN(AbstractC31177DnL.A09((Fragment) this.A01));
        }
        return C0eB.A00;
    }
}
