package X;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.odin.model.FeatureData;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.state.CreationState;
import com.instagram.feed.media.ReelCTA;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.rtc.presentation.arsidebar.ArSidebarButton;
import com.instagram.rtc.rsys.models.ParticipantModel;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.lang.ref.Reference;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public abstract class MSW {
    public static int A02(float f, float f2) {
        return C1H4.A01(f / f2);
    }

    public static ReelCTA A0a(List list) {
        return (ReelCTA) list.get(0);
    }

    public static void A1Z(Object obj, MAL mal) {
        mal.A01 = obj;
        mal.A02 = null;
        mal.A03 = null;
    }

    public static double A00(Object obj) {
        return ((Number) obj).doubleValue();
    }

    public static int A01() {
        return AbstractC50712Us.A01.A03();
    }

    public static int A05(C115475Kh c115475Kh) {
        return c115475Kh.A08 - c115475Kh.A09;
    }

    public static int A06(C84B c84b) {
        return c84b.A01.size();
    }

    public static int A07(Integer[] numArr, int i) {
        return numArr[i].intValue();
    }

    public static Intent A08(Context context, Class cls) {
        return new Intent(context, (Class<?>) cls);
    }

    public static C2GS A0E() {
        return new C2GS();
    }

    public static C52942bb A0F(InterfaceC52932ba interfaceC52932ba, InterfaceC018407e interfaceC018407e) {
        return new C52942bb(interfaceC52932ba, interfaceC018407e);
    }

    public static C25531Mh A0G(C22F c22f) {
        return C25531Mh.A08(c22f.A01);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.82I, X.0Zx] */
    public static C82I A0H() {
        return new C0Zx();
    }

    public static C3SN A0L(Object obj, String str, boolean z) {
        return new C3SN(obj, str, z);
    }

    public static C17z A0O(Writer writer) {
        return AbstractC221915u.A00.A0A(writer);
    }

    public static UserSession A0Q(Object obj) {
        return C023409i.A0A.A08(obj);
    }

    public static CreationState A0Y(String str, int i) {
        return new CreationState(str, i);
    }

    public static EnumC53258Ngw A0Z(int i) {
        float[] fArr = AbstractC55164OdS.A00;
        return EnumC53258Ngw.values()[i];
    }

    public static File A0w(File file, String str) {
        return new File(file, str);
    }

    public static FileOutputStream A0x(File file) {
        return new FileOutputStream(file);
    }

    public static IOException A0y(String str) {
        return new IOException(str);
    }

    public static Long A0z(long j) {
        return new Long(j);
    }

    public static Object A10(C6FW c6fw, int i) {
        return c6fw.A00.get(i);
    }

    public static Object A11(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return ((AnonymousClass198) obj).A0E(interfaceC23621Ds);
    }

    public static Object A12(Object obj, SerialDescriptor serialDescriptor, C3T8 c3t8, C3R9[] c3r9Arr, int i) {
        return c3t8.AOF(obj, c3r9Arr[i], serialDescriptor, i);
    }

    public static List A17(C38321qM c38321qM) {
        return c38321qM.A0C.C1L();
    }

    public static AtomicInteger A1C(int i) {
        return new AtomicInteger(i);
    }

    public static C09540e5 A1D(Throwable th) {
        return new C09540e5(th);
    }

    public static C57216Pb0 A1E(Object obj, int i) {
        return new C57216Pb0(obj, i);
    }

    public static MTX A1F(Object obj, int i) {
        return new MTX(obj, i);
    }

    public static ME0 A1G(Object obj, Object obj2, int i) {
        return new ME0(i, obj, obj2);
    }

    public static C50112Sa A1H(InterfaceC16620sF interfaceC16620sF, C19L c19l) {
        return AbstractC23641Du.A02(AnonymousClass191.A00, interfaceC16620sF, c19l);
    }

    public static C15340po A1I(InterfaceC16620sF interfaceC16620sF, InterfaceC19390xP interfaceC19390xP) {
        return new C15340po(interfaceC16620sF, interfaceC19390xP);
    }

    public static void A1J() {
        C14360o3.A0F("aleBridge");
        throw null;
    }

    public static void A1K() {
        C14360o3.A0F("dependencyProvider");
        throw null;
    }

    public static void A1M(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "surface");
    }

    public static void A1N(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "tool_type");
    }

    public static void A1O(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, "media_type");
    }

    public static void A1P(InterfaceC02530Ab interfaceC02530Ab, AbstractC02600Aj abstractC02600Aj) {
        abstractC02600Aj.A0M(interfaceC02530Ab, "surface");
    }

    public static void A1Q(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A8R(EnumC114925Hg.CLIPS, "camera_destination");
    }

    public static void A1R(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("entity", str);
    }

    public static void A1S(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("media_id", str);
    }

    public static void A1T(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("view_mode", str);
    }

    public static void A1U(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("waterfall_id", str);
    }

    public static void A1V(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("legacy_falco_event_name", str);
    }

    public static void A1W(C25531Mh c25531Mh) {
        c25531Mh.A0s("IG_CAMERA_ENTITY_TAP");
    }

    public static void A1X(Object obj) {
        C1OU c1ou = C1OU.$redex_init_class;
        C14360o3.A0B(obj, 0);
    }

    public static void A1Y(Object obj, Object obj2, Object obj3, MAP map) {
        map.A01 = obj;
        map.A02 = obj2;
        map.A03 = obj3;
    }

    public static boolean A1a(int i) {
        return android.util.Log.isLoggable("Paging", i);
    }

    public static int A03(View view) {
        return view.getHeight() / 2;
    }

    public static int A04(ClipsCreationViewModel clipsCreationViewModel) {
        return ClipsCreationViewModel.A00(clipsCreationViewModel).A00;
    }

    public static Handler A09(InterfaceC09390do interfaceC09390do) {
        return (Handler) interfaceC09390do.getValue();
    }

    public static View A0A(C12500ku c12500ku) {
        return (View) c12500ku.next();
    }

    public static ViewGroup A0B(InterfaceC09390do interfaceC09390do) {
        return (ViewGroup) interfaceC09390do.getValue();
    }

    public static ImageView A0C(InterfaceC09390do interfaceC09390do) {
        return (ImageView) interfaceC09390do.getValue();
    }

    public static TextView A0D(InterfaceC09390do interfaceC09390do) {
        return (TextView) interfaceC09390do.getValue();
    }

    public static C54806OKa A0I(Reference reference) {
        return (C54806OKa) reference.get();
    }

    public static C51757Mtg A0J(Iterator it) {
        return (C51757Mtg) it.next();
    }

    public static FeatureData A0K(Object obj, AbstractMap abstractMap) {
        return (FeatureData) abstractMap.get(obj);
    }

    public static C2JS A0M(List list) {
        return (C2JS) AbstractC001800i.A0J(list);
    }

    public static C2JS A0N(List list, int i) {
        return (C2JS) list.get(i);
    }

    public static BrandedContentDisclosureBaseViewModel A0P(InterfaceC09390do interfaceC09390do) {
        return (BrandedContentDisclosureBaseViewModel) interfaceC09390do.getValue();
    }

    public static MediaSession A0R(Iterator it) {
        return (MediaSession) it.next();
    }

    public static C448124l A0S(UserSession userSession) {
        return AnonymousClass229.A01(userSession).A09;
    }

    public static NI7 A0T(Iterator it) {
        return (NI7) it.next();
    }

    public static OXZ A0U(Iterator it) {
        return (OXZ) it.next();
    }

    public static C115475Kh A0V(C84B c84b, int i) {
        return (C115475Kh) c84b.A04(i);
    }

    public static C84B A0W(C2GT c2gt) {
        return (C84B) c2gt.A02();
    }

    public static C50991Mfy A0X(InterfaceC09390do interfaceC09390do) {
        return (C50991Mfy) interfaceC09390do.getValue();
    }

    public static IGTVUploadViewModel A0b(InterfaceC09390do interfaceC09390do) {
        return (IGTVUploadViewModel) interfaceC09390do.getValue();
    }

    public static P45 A0c(NMX nmx) {
        return NMX.A01(nmx).A0M;
    }

    public static NOW A0d(N4B n4b) {
        return (NOW) n4b.A05();
    }

    public static NOW A0e(InterfaceC09390do interfaceC09390do) {
        return (NOW) interfaceC09390do.getValue();
    }

    public static C50998Mg5 A0f(InterfaceC09390do interfaceC09390do) {
        return (C50998Mg5) interfaceC09390do.getValue();
    }

    public static C50964MfX A0g(InterfaceC09390do interfaceC09390do) {
        return (C50964MfX) interfaceC09390do.getValue();
    }

    public static C51038Mgo A0h(InterfaceC09390do interfaceC09390do) {
        return (C51038Mgo) interfaceC09390do.getValue();
    }

    public static C51008MgF A0i(InterfaceC09390do interfaceC09390do) {
        return (C51008MgF) interfaceC09390do.getValue();
    }

    public static C51009MgG A0j(InterfaceC09390do interfaceC09390do) {
        return (C51009MgG) interfaceC09390do.getValue();
    }

    public static C50949MfI A0k(InterfaceC09390do interfaceC09390do) {
        return (C50949MfI) interfaceC09390do.getValue();
    }

    public static C51053Mh7 A0l(InterfaceC09390do interfaceC09390do) {
        return (C51053Mh7) interfaceC09390do.getValue();
    }

    public static C50664MYh A0m(InterfaceC09390do interfaceC09390do) {
        return (C50664MYh) interfaceC09390do.getValue();
    }

    public static BrandedContentTag A0n(Iterator it) {
        return (BrandedContentTag) it.next();
    }

    public static PromptStickerModel A0o(InterfaceC09390do interfaceC09390do) {
        return (PromptStickerModel) interfaceC09390do.getValue();
    }

    public static IgRoomDatabase A0p(AbstractC12990ll abstractC12990ll, Class cls) {
        return (IgRoomDatabase) abstractC12990ll.A00(cls);
    }

    public static C55210OeT A0q(InterfaceC09390do interfaceC09390do) {
        return (C55210OeT) interfaceC09390do.getValue();
    }

    public static ArSidebarButton A0r(InterfaceC09390do interfaceC09390do) {
        return (ArSidebarButton) interfaceC09390do.getValue();
    }

    public static ParticipantModel A0s(Iterator it) {
        return (ParticipantModel) it.next();
    }

    public static MediaTaggingInfo A0t(AbstractList abstractList, int i) {
        return (MediaTaggingInfo) abstractList.get(i);
    }

    public static C51709Mse A0u(C0UO c0uo) {
        return (C51709Mse) c0uo.getValue();
    }

    public static AbstractC53034Nd6 A0v(InterfaceC09390do interfaceC09390do) {
        return (AbstractC53034Nd6) interfaceC09390do.getValue();
    }

    public static String A13(MediaSuggestedProductTag mediaSuggestedProductTag) {
        return mediaSuggestedProductTag.A07().A0H;
    }

    public static String A14(List list, int i) {
        return (String) AbstractC001800i.A0O(list, i);
    }

    public static String A15(C05A c05a) {
        return (String) c05a.getValue();
    }

    public static AbstractList A16(AbstractList abstractList, int i) {
        return (AbstractList) abstractList.get(i);
    }

    public static List A18(Object obj, AbstractMap abstractMap) {
        return (List) abstractMap.get(obj);
    }

    public static List A19(Map.Entry entry) {
        return (List) entry.getValue();
    }

    public static List A1A(C05A c05a) {
        return (List) c05a.getValue();
    }

    public static List A1B(C0UO c0uo) {
        return (List) c0uo.getValue();
    }

    public static void A1L(Context context, C189448aO c189448aO, int i) {
        c189448aO.A0g = context.getString(i);
    }

    public static boolean A1b(Map map) {
        return !map.isEmpty();
    }
}
