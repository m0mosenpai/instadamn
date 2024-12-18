package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ClipsMashupType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayDeque;

/* renamed from: X.Gl9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37855Gl9 {
    public static final C37855Gl9 A00 = new Object();

    public static final SpannableString A00(Context context, C38321qM c38321qM) {
        C4GI BZr;
        InterfaceC84163p3 A1P = c38321qM.A1P();
        if (A1P == null || (BZr = A1P.BZr()) == null) {
            return null;
        }
        String username = BZr.CDj().getUsername();
        Resources resources = context.getResources();
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = 2131955757;
        if (A1P.BPi() == ClipsMashupType.A0A) {
            i = 2131955787;
        }
        A01.append((CharSequence) resources.getString(i));
        AbstractC31423DrT.A00(A01, username, "{username}", arrayDeque, new Object[]{new StyleSpan(1)}, 0);
        return new SpannableString(A01);
    }

    public static final C1816283r A01(UserSession userSession, EnumC189548aZ enumC189548aZ, String str) {
        C38321qM A0h;
        User A2E;
        String A2a;
        long A1C;
        C14360o3.A0B(userSession, 0);
        if (str != null && (A0h = AbstractC25229BEm.A0h(userSession, str)) != null && (A2E = A0h.A2E(userSession)) != null) {
            if (A0h.A5x()) {
                ExtendedImageUrl A1o = A0h.A1o(A0h.A0z());
                if (A1o != null) {
                    A2a = A1o.A0A;
                }
            } else {
                A2a = A0h.A2a();
            }
            if (A2a != null) {
                if (A0h.A1C() <= 0 && A0h.Cff()) {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(A2a);
                        A1C = MY4.A01(mediaMetadataRetriever);
                    } catch (Exception e) {
                        String id = A0h.getId();
                        if (id != null) {
                            C0w9.A03("ClipsRemixUtil _media_metadata_retriever_error.", AnonymousClass001.A0u("for media id: ", id, ", exc: ", e.getMessage()));
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    return new C1816283r(new A7D(A2a, A1C), enumC189548aZ, A0h, A2E);
                }
                A1C = A0h.A1C();
                return new C1816283r(new A7D(A2a, A1C), enumC189548aZ, A0h, A2E);
            }
        }
        return null;
    }

    public static final void A02(Activity activity, C22P c22p, UserSession userSession, ImageUrl imageUrl, EnumC189548aZ enumC189548aZ, C38321qM c38321qM, C38321qM c38321qM2, DirectCameraViewModel directCameraViewModel, MusicAttributionConfig musicAttributionConfig, Boolean bool, String str, String str2, String str3, boolean z) {
        String str4;
        Class cls;
        MusicAssetModel musicAssetModel;
        if (musicAttributionConfig != null && (musicAssetModel = musicAttributionConfig.A02) != null) {
            str4 = musicAssetModel.A0E;
        } else {
            str4 = null;
        }
        C38801rC c38801rC = C38321qM.A0h;
        String id = c38321qM.getId();
        if (id != null) {
            String A06 = C38801rC.A06(id);
            C14360o3.A0B(c22p, 1);
            DirectCameraViewModel directCameraViewModel2 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Boolean bool2 = null;
            ImageUrl imageUrl2 = null;
            String str8 = null;
            String str9 = null;
            boolean z2 = false;
            EnumC185548Kw enumC185548Kw = EnumC185548Kw.A05;
            C5JK c5jk = C5JK.A05;
            java.util.Set A0n = AbstractC37304Gc5.A0n(c22p);
            String id2 = c38321qM.getId();
            if (id2 != null) {
                String A1G = AbstractC25226BEj.A1G(c38321qM);
                if (directCameraViewModel != null) {
                    directCameraViewModel2 = directCameraViewModel;
                }
                if (c38321qM2 != null) {
                    str8 = c38321qM2.A2u();
                    str9 = AbstractC25226BEj.A1G(c38321qM2);
                }
                if (str4 != null) {
                    z2 = true;
                }
                if (str != null && !C18U.A06(C06090Tz.A05, userSession, 36328177714347304L)) {
                    str6 = str;
                    str7 = str2;
                    str5 = str3;
                    bool2 = bool;
                    imageUrl2 = imageUrl;
                    enumC185548Kw = EnumC185548Kw.A04;
                }
                if (z) {
                    cls = TransparentModalActivity.class;
                } else {
                    cls = ModalActivity.class;
                }
                C6XJ A02 = C6XJ.A02(activity, ALh.A02(c22p, null, null, enumC185548Kw, imageUrl2, c5jk, enumC189548aZ, directCameraViewModel2, musicAttributionConfig, bool2, str6, str5, str7, null, null, str4, A06, A1G, id2, str8, str9, A0n, true, z2), userSession, cls, "clips_camera");
                A02.A0D = !C18U.A06(C06090Tz.A05, userSession, 36330041730220685L);
                AbstractC31179DnN.A1S(A02);
                A02.A0A(activity, 9587);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A04(Fragment fragment, FragmentActivity fragmentActivity, C22P c22p, ClipsMashupType clipsMashupType, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ImageUrl imageUrl, C38321qM c38321qM, C38321qM c38321qM2, C37855Gl9 c37855Gl9, Boolean bool, Integer num, String str, String str2, String str3, String str4) {
        EnumC189548aZ enumC189548aZ;
        if (!c38321qM.A5c()) {
            if (c22p != C22P.A1Y && c22p != C22P.A1Z && clipsMashupType == null) {
                C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                String str5 = userSession.token;
                String moduleName = interfaceC11380iw.getModuleName();
                String id = c38321qM.getId();
                if (id != null) {
                    int A0K = AbstractC167017dG.A0K(num);
                    AbstractC25230BEn.A15(1, str5, moduleName);
                    C38922HBu c38922HBu = new C38922HBu();
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", str5);
                    A0b.putString("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_CONTAINER_MODULE_NAME", moduleName);
                    A0b.putString("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_MEDIA_ID", id);
                    A0b.putInt("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_MEDIA_INDEX", A0K);
                    A0b.putString("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_SOURCE_MEDIA_ID", str);
                    A0b.putSerializable("ClipsConstants.ARG_CLIPS_VIEWER_REMIX_OPTIONS_ENTRY_POINT", c22p);
                    A0b.putString("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_ID", str2);
                    A0b.putString("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_NAME", str3);
                    A0b.putString("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_ATTRIBUTION_USER_ID", str4);
                    if (bool != null) {
                        A0b.putBoolean("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_SUPPORTED", bool.booleanValue());
                    }
                    A0b.putParcelable("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_PRELOADED_EFFECT_THUMBNAIL_URL", imageUrl);
                    A0b.putBoolean("ClipsConstants.ARG_CLIPS_REMIX_OPTIONS_USE_TRANSPARENT_MODAL_ACTIVITY", true);
                    c38922HBu.setArguments(A0b);
                    AbstractC31173DnH.A0w(fragmentActivity, c38922HBu, A0y);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            if (clipsMashupType == ClipsMashupType.A0A) {
                enumC189548aZ = EnumC189548aZ.A07;
                c37855Gl9.A0F(fragmentActivity, fragment, c22p, userSession, imageUrl, enumC189548aZ, c38321qM, c38321qM2, bool, str2, str3, str4, true);
            }
        }
        enumC189548aZ = EnumC189548aZ.A06;
        c37855Gl9.A0F(fragmentActivity, fragment, c22p, userSession, imageUrl, enumC189548aZ, c38321qM, c38321qM2, bool, str2, str3, str4, true);
    }

    public static final void A05(Fragment fragment, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        C4GI BZr;
        String moduleName;
        String str3;
        if (str == null) {
            moduleName = interfaceC60442pS.getModuleName();
            str3 = "session id is null";
        } else {
            InterfaceC84163p3 A1P = c38321qM.A1P();
            if (A1P == null || (BZr = A1P.BZr()) == null) {
                return;
            }
            if (AbstractC40562Hyi.A00(BZr)) {
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("shopping_session_id", str2);
                C140966Yy A0C = AbstractC31175DnJ.A0C(fragment, userSession);
                String moduleName2 = interfaceC60442pS.getModuleName();
                C14360o3.A0B(moduleName2, 0);
                String A002 = AbstractC111324zv.A00(3537);
                String string = fragment.getString(2131969869);
                String A2u = c38321qM.A2u();
                String moduleName3 = interfaceC60442pS.getModuleName();
                ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
                contextualFeedFragment.setArguments(C31569Dtv.A04(A0b, A002, string, A2u, moduleName2, moduleName3, str, null));
                AbstractC31175DnJ.A0s(null, contextualFeedFragment, A0C);
                return;
            }
            String productType = BZr.getProductType();
            if (productType != null && ProductType.CLIPS == ProductType.A01.get(productType)) {
                C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A1w, userSession);
                c116875Qr.A1D = c38321qM.A38();
                AbstractC86593tX.A0X(fragment.requireActivity(), c116875Qr.A00(), userSession);
                return;
            }
            moduleName = interfaceC60442pS.getModuleName();
            str3 = "unknown original media type";
        }
        C0w9.A03(moduleName, str3);
    }

    public static final void A06(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        AbstractC166987dD.A1Z(new D51(userSession, (InterfaceC23621Ds) null, 49), AbstractC167017dG.A0w(C12L.A00, 1596010039));
    }

    public static final void A07(UserSession userSession, Context context, FragmentActivity fragmentActivity) {
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        AbstractC31171DnF.A10(context, A0C, 2131973869);
        A0C.A0i = true;
        AbstractC31177DnL.A0n(fragmentActivity, W6d.A00(A0C, C66277U6x.A00(AbstractC111324zv.A00(825))), userSession, ModalActivity.class, "bloks");
    }

    public static final boolean A08(Context context, C185368Kc c185368Kc, UserSession userSession, Integer num, int i) {
        C14360o3.A0B(context, 4);
        if (c185368Kc != null && EnumC189548aZ.A07 == c185368Kc.A03 && num != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36317182598058841L)) {
                int intValue = i - num.intValue();
                long A01 = C18U.A01(c06090Tz, userSession, 36598657574833408L);
                long j = intValue;
                if (0 <= j && j <= A01) {
                    C9GR.A09(context, AbstractC166997dE.A0r(context.getResources(), Integer.valueOf((int) (A01 / 1000)), 2131973322));
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A09(Context context, EnumC189548aZ enumC189548aZ, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(context, 0);
        if (!z || !z2 || !z3 || !z4 || enumC189548aZ != EnumC189548aZ.A06) {
            return false;
        }
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A05();
        AbstractC25226BEj.A1N(context, A0K, 2131972152);
        A0K.A0J = true;
        AbstractC25233BEq.A1F(A0K);
        return true;
    }

    public static final boolean A0C(UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C37855Gl9 c37855Gl9 = A00;
        if (!A0D(c38321qM)) {
            return false;
        }
        if (c38321qM.A5x()) {
            InterfaceC84163p3 BPh = c38321qM.A0C.BPh();
            if (BPh != null) {
                return BPh.getMashupsAllowed();
            }
            return false;
        }
        if (c38321qM.A5c()) {
            InterfaceC84163p3 BPh2 = c38321qM.A0C.BPh();
            return BPh2 != null && BPh2.getMashupsAllowed() && c38321qM.A1C() <= StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
        }
        InterfaceC84163p3 A1P = c38321qM.A1P();
        if (A1P == null || !A1P.getMashupsAllowed() || c38321qM.A5H()) {
            return false;
        }
        return !C2TN.A02(userSession, c38321qM) || c37855Gl9.A0J(userSession);
    }

    public final void A0F(Activity activity, Fragment fragment, C22P c22p, UserSession userSession, ImageUrl imageUrl, EnumC189548aZ enumC189548aZ, C38321qM c38321qM, C38321qM c38321qM2, Boolean bool, String str, String str2, String str3, boolean z) {
        boolean A1a = AbstractC167017dG.A1a(userSession, c38321qM);
        C14360o3.A0B(c22p, 4);
        C006802i.A0p.markerStart(366619078);
        if ((c38321qM.A5d() || c38321qM.A5g()) && c38321qM.A1K() == null && c38321qM.A1Q() == null) {
            MEN men = new MEN(userSession, c38321qM, activity, c22p, enumC189548aZ, bool, imageUrl, null, c38321qM2, str, str2, str3, A1a ? 1 : 0, z);
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0R(C38869H9r.class, C41299IPo.class);
            A0c.A0B("music/configure_original_sound_for_mashup/");
            String A38 = c38321qM.A38();
            if (A38 != null) {
                C1ON A0T = AbstractC31172DnG.A0T(A0c, "original_media_id", A38);
                A0T.A00 = new C33111EjF(fragment.getParentFragmentManager(), men, c38321qM, 3);
                C1GJ.A00(fragment.requireContext(), AbstractC018607g.A00(fragment), A0T);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        A02(activity, c22p, userSession, imageUrl, enumC189548aZ, c38321qM, c38321qM2, null, A0E(activity, c38321qM), bool, str, str2, str3, z);
    }

    public final void A0G(Activity activity, C9JS c9js, C38321qM c38321qM, INH inh) {
        EnumC189548aZ enumC189548aZ;
        MusicAssetModel musicAssetModel;
        C14360o3.A0B(activity, 1);
        MusicAttributionConfig A0E = A0E(activity, c38321qM);
        String id = c38321qM.getId();
        if (id != null) {
            inh.A0f = id;
            String str = null;
            if (c9js != null) {
                enumC189548aZ = c9js.A06;
            } else {
                enumC189548aZ = null;
            }
            inh.A07 = enumC189548aZ;
            inh.A08 = A0E;
            if (A0E != null && (musicAssetModel = A0E.A02) != null) {
                str = musicAssetModel.A0E;
            }
            inh.A0G = str;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A0H(Context context, AbstractC018607g abstractC018607g, UserSession userSession, C38321qM c38321qM, String str) {
        InterfaceC84163p3 A1P;
        int i;
        int i2;
        int i3;
        C193328hC A0I;
        DialogInterfaceOnClickListenerC35370Fil dialogInterfaceOnClickListenerC35370Fil;
        EnumC193348hE enumC193348hE;
        AbstractC37302Gc3.A1U(abstractC018607g, str);
        InterfaceC84163p3 BPh = c38321qM.A0C.BPh();
        if ((BPh != null && BPh.getMashupsAllowed()) || ((A1P = c38321qM.A1P()) != null && A1P.getMashupsAllowed())) {
            int i4 = 2131975794;
            int i5 = 2131975791;
            i = 2131975795;
            i2 = 2131975793;
            i3 = 2131975792;
            if (c38321qM.A5P()) {
                i4 = 2131975799;
                i5 = 2131975796;
                i = 2131975800;
                i2 = 2131975798;
                i3 = 2131975797;
            }
            A0I = AbstractC31171DnF.A0I(context);
            A0I.A0A(i4);
            A0I.A09(i5);
            dialogInterfaceOnClickListenerC35370Fil = new DialogInterfaceOnClickListenerC35370Fil(context, abstractC018607g, userSession, c38321qM, str, 1, true);
            enumC193348hE = EnumC193348hE.A06;
        } else {
            int i6 = 2131952929;
            int i7 = 2131952926;
            i = 2131952925;
            i2 = 2131952928;
            i3 = 2131952927;
            if (c38321qM.A5P()) {
                i6 = 2131952934;
                i7 = 2131952931;
                i = 2131952930;
                i2 = 2131952933;
                i3 = 2131952932;
            }
            A0I = AbstractC31171DnF.A0I(context);
            A0I.A0A(i6);
            A0I.A09(i7);
            dialogInterfaceOnClickListenerC35370Fil = new DialogInterfaceOnClickListenerC35370Fil(context, abstractC018607g, userSession, c38321qM, str, 1, false);
            enumC193348hE = EnumC193348hE.A03;
        }
        A0I.A0R(dialogInterfaceOnClickListenerC35370Fil, enumC193348hE, i);
        A0I.A0H(new DialogInterfaceOnClickListenerC55321Ogj(63, context, userSession), i2);
        AbstractC31176DnK.A16(null, A0I, i3);
    }

    public final void A0I(Fragment fragment, FragmentActivity fragmentActivity, C22P c22p, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, Integer num, String str) {
        AbstractC167017dG.A1N(interfaceC11380iw, userSession);
        AbstractC167007dF.A1D(c22p, 7, c38321qM);
        A04(fragment, fragmentActivity, c22p, null, interfaceC11380iw, userSession, null, c38321qM, null, this, null, num, str, null, null, null);
    }

    public final boolean A0K(UserSession userSession) {
        if (AbstractC166987dD.A10(userSession).A0M() != C05F.A01) {
            return false;
        }
        if (!A0B(userSession) && !A0A(userSession)) {
            return false;
        }
        return true;
    }

    public static final void A03(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC31173DnH.A1C(AbstractC166987dD.A0b(), userSession);
        EHk eHk = new EHk();
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC25225BEi.A1Q(A0y, false);
        A0y.A0g = context.getString(2131968948);
        A0y.A0v = true;
        A0y.A1J = true;
        A0y.A0h = context.getString(2131961985);
        A0y.A0L = new ViewOnClickListenerC42029Ijy(38, fragmentActivity, context, userSession);
        A0y.A1N = true;
        String A0p = AbstractC166997dE.A0p(context, 2131961983);
        C33259Elt c33259Elt = new C33259Elt(context, userSession, A0p, AbstractC31174DnI.A02(context));
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0p);
        AnonymousClass773.A02(A0H, c33259Elt, A0p);
        A0y.A0b = A0H;
        C189478aR A002 = A0y.A00();
        AbstractC166987dD.A1Z(new C57159PZd(A002, fragmentActivity, eHk, null, 17), C07Y.A00(fragmentActivity));
    }

    public static final boolean A0A(UserSession userSession) {
        Boolean Cbo;
        User A02 = AnonymousClass189.A00(userSession).A02(userSession.userId);
        if (A02 != null && (Cbo = A02.A03.Cbo()) != null && Cbo.booleanValue() && !A0B(userSession)) {
            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
            InterfaceC16530ry interfaceC16530ry = A002.A4p;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!AbstractC167017dG.A1b(A002, interfaceC16530ry, c0yrArr, 331)) {
                C23031Ai A003 = AbstractC23021Ah.A00(userSession);
                if (!AbstractC167017dG.A1b(A003, A003.A4o, c0yrArr, 330)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean A0B(UserSession userSession) {
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        InterfaceC16530ry interfaceC16530ry = A002.A7M;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (!AbstractC167017dG.A1b(A002, interfaceC16530ry, c0yrArr, 266)) {
            C23031Ai A003 = AbstractC23021Ah.A00(userSession);
            if (!AbstractC167017dG.A1b(A003, A003.A4p, c0yrArr, 331)) {
                C23031Ai A004 = AbstractC23021Ah.A00(userSession);
                if (!AbstractC167017dG.A1b(A004, A004.A4o, c0yrArr, 330)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A0D(C38321qM c38321qM) {
        if (!c38321qM.A5D() && c38321qM.A1z() != null && c38321qM.A1x() != EnumC76383bi.A04 && c38321qM.A1x() != EnumC76383bi.A08 && !c38321qM.A5U()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r2 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.music.common.config.MusicAttributionConfig A0E(android.app.Activity r10, X.C38321qM r11) {
        /*
            r9 = this;
            X.AbstractC167017dG.A1N(r10, r11)
            X.3xC r2 = r11.A1Q()
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r11.A1K()
            if (r0 == 0) goto L5a
            X.5Si r1 = new X.5Si
            r1.<init>(r0)
        L12:
            if (r2 == 0) goto L5c
            com.instagram.api.schemas.MusicInfo r0 = r2.A00
            com.instagram.api.schemas.TrackData r2 = r0.BVV()
            com.instagram.music.common.model.MusicConsumptionModel r1 = r0.BVa()
            java.lang.Integer r0 = r1.Adg()
            r3 = 0
            r8 = 0
            if (r0 != 0) goto L34
            java.util.List r0 = r2.BE6()
            if (r0 == 0) goto L58
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r8)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L58
        L34:
            int r6 = r0.intValue()
            if (r2 == 0) goto L3e
        L3a:
            com.instagram.music.common.model.MusicAssetModel r3 = com.instagram.music.common.model.MusicAssetModel.A01(r2, r8)
        L3e:
            r2 = 0
            boolean r7 = r1.getShouldMuteAudio()
            java.lang.String r5 = r1.getShouldMuteAudioReason()
            java.lang.Boolean r0 = r1.AbG()
            if (r0 == 0) goto L51
            boolean r8 = r0.booleanValue()
        L51:
            com.instagram.music.common.config.MusicAttributionConfig r1 = new com.instagram.music.common.config.MusicAttributionConfig
            r4 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L58:
            r6 = 0
            goto L3a
        L5a:
            r1 = 0
            goto L12
        L5c:
            if (r1 == 0) goto L67
            android.content.Context r0 = X.AbstractC166987dD.A0O(r10)
            com.instagram.music.common.config.MusicAttributionConfig r1 = r1.Cq1(r0)
            return r1
        L67:
            java.lang.String r1 = "null music/sound model for media id: "
            java.lang.String r0 = r11.getId()
            if (r0 == 0) goto L7a
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.String r0 = "ClipsRemixUtil_create_music_attribution_config_null"
            X.C0w9.A03(r0, r1)
            r1 = 0
            return r1
        L7a:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37855Gl9.A0E(android.app.Activity, X.1qM):com.instagram.music.common.config.MusicAttributionConfig");
    }

    public final boolean A0J(UserSession userSession) {
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        if ((!A0x.getBoolean("clips_media_remix_enabled", false) && AbstractC31175DnJ.A03(A0x, "preference_clips_account_remix_enabled_last_sync_ms") + 43200000 > System.currentTimeMillis()) || AbstractC166987dD.A10(userSession).A0M() != C05F.A01) {
            return false;
        }
        return true;
    }
}
