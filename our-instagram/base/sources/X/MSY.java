package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.util.JsonWriter;
import android.util.Pair;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.pendingmedia.service.common.IngestionStepDebugLogger;
import com.instagram.user.model.User;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public abstract class MSY {
    public static int A01(int i) {
        return i == 0 ? 8 : 0;
    }

    public static C1ON A0I(C25621Ms c25621Ms, String str, String str2) {
        c25621Ms.A9s(str, str2);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static Object A0a(C6FW c6fw) {
        return c6fw.A00.get(0);
    }

    public static AnonymousClass195 A0r(AnonymousClass195 anonymousClass195) {
        if (anonymousClass195 == null) {
            return null;
        }
        anonymousClass195.AGH(null);
        return null;
    }

    public static C24721Ip A0s() {
        return new C24721Ip(0);
    }

    public static AnonymousClass057 A0t() {
        return C10M.A00(C05F.A00, 0, 0);
    }

    public static void A1E(IgdsButton igdsButton) {
        igdsButton.setLoading(true);
        igdsButton.setEnabled(false);
    }

    public static void A1F(IgdsButton igdsButton) {
        igdsButton.setLoading(false);
        igdsButton.setEnabled(true);
    }

    public static void A1M(Object obj, C19L c19l, int i) {
        AbstractC23641Du.A05(AnonymousClass191.A00, new MC3(obj, (InterfaceC23621Ds) null, i), c19l);
    }

    public static void A1N(Object obj, InterfaceC06180Ui interfaceC06180Ui) {
        C14360o3.A0B(interfaceC06180Ui, 0);
        interfaceC06180Ui.F8m(obj);
    }

    public static boolean A1R(int i) {
        return i >= 0;
    }

    public static boolean A1S(int i, int i2) {
        return i != i2;
    }

    public static int A02(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
        return 8;
    }

    public static int A04(Object obj) {
        return obj != null ? 0 : 8;
    }

    public static long A06(String str) {
        return new File(str).length();
    }

    public static HandlerThread A0A(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        AbstractC09770fa.A00(handlerThread);
        return handlerThread;
    }

    public static SpannableStringBuilder A0B(ClickableSpan clickableSpan, CharSequence charSequence, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        AnonymousClass773.A05(spannableStringBuilder, clickableSpan, str);
        return spannableStringBuilder;
    }

    public static JsonWriter A0C(Writer writer) {
        return new JsonWriter(writer).beginObject();
    }

    public static ViewPropertyAnimator A0F(ViewPropertyAnimator viewPropertyAnimator) {
        return viewPropertyAnimator.setDuration(300L);
    }

    public static InterfaceC02590Ai A0H(Object obj, String str) {
        C18920wW c18920wW = (C18920wW) obj;
        return c18920wW.A00(c18920wW.A00, str);
    }

    public static C1QX A0J() {
        C1QX c1qx = new C1QX();
        c1qx.A04 = EnumC23341Bw.API;
        return c1qx;
    }

    public static C84B A0N(ClipsCreationViewModel clipsCreationViewModel) {
        return (C84B) clipsCreationViewModel.A0G.A02();
    }

    public static C50977Mfk A0T(NQ4 nq4) {
        return (C50977Mfk) nq4.A00.getValue();
    }

    public static OME A0V(Object obj) {
        OME ome = (OME) obj;
        C14360o3.A0B(ome, 0);
        return ome;
    }

    public static C44059Jdk A0W(Medium medium, int i) {
        C44059Jdk A00 = C44059Jdk.A00(medium.A0X, i);
        C14360o3.A07(A00);
        return A00;
    }

    public static Double A0Y() {
        return Double.valueOf(0.0d);
    }

    public static Object A0b(MQE mqe, IngestionStepDebugLogger ingestionStepDebugLogger, OXD oxd, InterfaceC23621Ds interfaceC23621Ds) {
        return ingestionStepDebugLogger.A01(mqe, oxd, interfaceC23621Ds, 0L);
    }

    public static Object A0c(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16510rw interfaceC16510rw) {
        return new C60842q8(interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16510rw).getValue();
    }

    public static String A0f(C23031Ai c23031Ai, String str, String str2) {
        String string = c23031Ai.A01.getString(str, str2);
        C14360o3.A07(string);
        return string;
    }

    public static ArrayList A0j(ArrayList arrayList) {
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    public static List A0l(Iterable iterable) {
        if (iterable != null) {
            return AbstractC001800i.A0a(iterable);
        }
        return C16930sl.A00;
    }

    public static List A0m(List list) {
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public static C09530e4 A0n(UserSession userSession) {
        return new C09530e4("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
    }

    public static C17050sx A0p(Object obj, int i) {
        return AbstractC09440dt.A01(new C37016GSx(obj, i));
    }

    public static C19K A0v() {
        return AnonymousClass194.A02(C12L.A00.A04);
    }

    public static void A0w(int i, List list) {
        list.add(new C31335Dq0(i));
    }

    public static void A0x(View view) {
        if (view != null) {
            view.setAlpha(1.0f);
        }
    }

    public static void A10(View view, int i, int i2) {
        view.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
    }

    public static void A17(InterfaceC02590Ai interfaceC02590Ai, List list) {
        interfaceC02590Ai.AAk("current_guest_ids", list);
        interfaceC02590Ai.Cht();
    }

    public static void A1A(C25531Mh c25531Mh) {
        c25531Mh.A0t(C1QM.A00.A02.A00);
    }

    public static void A1B(C1125456i c1125456i, C1125856m c1125856m, C1125656k c1125656k) {
        c1125656k.A03 = c1125456i;
        c1125856m.A02(c1125656k.A00());
    }

    public static void A1G(InterfaceC57990Pna interfaceC57990Pna) {
        if (interfaceC57990Pna != null) {
            interfaceC57990Pna.afterSelection(false);
        }
    }

    public static void A1O(Object obj, float[] fArr, int i) {
        fArr[i] = ((Number) obj).floatValue();
    }

    public static void A1P(AbstractCollection abstractCollection, InterfaceC16620sF interfaceC16620sF, C19L c19l) {
        abstractCollection.add(AbstractC23641Du.A02(AnonymousClass191.A00, interfaceC16620sF, c19l));
    }

    public static boolean A1V(Class cls, Object obj) {
        return obj.equals(new C0YZ(cls));
    }

    public static boolean A1W(Class cls, Object obj) {
        return C14360o3.A0K(obj, new C0YZ(cls));
    }

    public static boolean A1X(Object obj) {
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj).booleanValue();
    }

    public static boolean A1Z(String str) {
        return new File(str).exists();
    }

    public static byte[] A1a(String str) {
        byte[] bytes = str.getBytes(C15W.A05);
        C14360o3.A07(bytes);
        return bytes;
    }

    public static float A00(C0UO c0uo) {
        return ((Number) c0uo.getValue()).floatValue();
    }

    public static int A03(C55228Oey c55228Oey, int i) {
        return c55228Oey.A0I(i).size();
    }

    public static int A05(InterfaceC09390do interfaceC09390do) {
        return ((View) interfaceC09390do.getValue()).getVisibility();
    }

    public static long A07(Iterator it) {
        return ((Number) it.next()).longValue();
    }

    public static Bundle A08(Parcel parcel, Class cls) {
        return parcel.readBundle(cls.getClassLoader());
    }

    public static Handler A09(HandlerThread handlerThread) {
        return new Handler(handlerThread.getLooper());
    }

    public static Pair A0D(Object obj, int i) {
        return new Pair(obj, Integer.valueOf(i));
    }

    public static View A0E(InterfaceC09390do interfaceC09390do) {
        View view = (View) interfaceC09390do.getValue();
        C14360o3.A07(view);
        return view;
    }

    public static C14240no A0G(FragmentActivity fragmentActivity) {
        return new C14240no(fragmentActivity.getSupportFragmentManager());
    }

    public static C25671My A0K(FollowersShareFragment followersShareFragment) {
        return AbstractC25651Mw.A00(followersShareFragment.A0R());
    }

    public static C22C A0L(AbstractC52130N5e abstractC52130N5e) {
        return AnonymousClass229.A01(abstractC52130N5e.A0N());
    }

    public static C22C A0M(FollowersShareFragment followersShareFragment) {
        return AnonymousClass229.A01(followersShareFragment.A0R());
    }

    public static NNE A0O(NMX nmx) {
        return NMX.A01(nmx).A02();
    }

    public static NNE A0P(InterfaceC09390do interfaceC09390do) {
        return ((IGTVUploadViewModel) interfaceC09390do.getValue()).A02();
    }

    public static P45 A0Q(InterfaceC09390do interfaceC09390do) {
        return ((IGTVUploadViewModel) interfaceC09390do.getValue()).A0M;
    }

    public static Reel A0R(UserSession userSession, String str) {
        return C1OU.A04(userSession).A0M(str);
    }

    public static MusicBrowseCategory A0S(InterfaceC09390do interfaceC09390do) {
        C51055Mh9 c51055Mh9 = (C51055Mh9) interfaceC09390do.getValue();
        return C51055Mh9.A00((EnumC53226NgO) c51055Mh9.A0D.getValue(), c51055Mh9).A00();
    }

    public static C47Z A0U(MediaSession mediaSession, InterfaceC189598ae interfaceC189598ae) {
        return interfaceC189598ae.BcC(mediaSession.BcD());
    }

    public static IOException A0X(String str, String str2) {
        return new IOException(AnonymousClass001.A0R(str, str2));
    }

    public static Long A0Z(AtomicInteger atomicInteger) {
        return Long.valueOf(atomicInteger.get());
    }

    public static RuntimeException A0d(String str, String str2) {
        return new RuntimeException(AnonymousClass001.A0R(str, str2));
    }

    public static String A0e(AnonymousClass182 anonymousClass182, Object obj) {
        anonymousClass182.close();
        String obj2 = obj.toString();
        C14360o3.A07(obj2);
        return obj2;
    }

    public static String A0g(User user) {
        return String.valueOf(user.BTC());
    }

    public static String A0h(Object obj) {
        return obj.getClass().getName();
    }

    public static ArrayList A0i(Object obj) {
        AbstractC09560e7.A00(obj);
        return new ArrayList();
    }

    public static ArrayList A0k(Map map) {
        return new ArrayList(map.size());
    }

    public static C09530e4 A0o(Object obj, boolean z) {
        return new C09530e4(obj, Boolean.valueOf(z));
    }

    public static AnonymousClass195 A0q(AbstractC52922bZ abstractC52922bZ, InterfaceC19390xP interfaceC19390xP) {
        return AbstractC18560vj.A03(AbstractC141776au.A00(abstractC52922bZ), interfaceC19390xP);
    }

    public static C008002u A0u(int i) {
        return new C008002u(Integer.valueOf(i));
    }

    public static void A0y(View view, int i) {
        ((ViewStub) view.requireViewById(i)).inflate();
    }

    public static void A0z(View view, int i, int i2) {
        View findViewById = view.findViewById(i);
        C14360o3.A07(findViewById);
        findViewById.setVisibility(i2);
    }

    public static void A11(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K("a_pk", Long.valueOf(j));
    }

    public static void A12(InterfaceC02590Ai interfaceC02590Ai, long j) {
        interfaceC02590Ai.A9K(TraceFieldType.BroadcastId, Long.valueOf(j));
    }

    public static void A13(InterfaceC02590Ai interfaceC02590Ai, MusicProduct musicProduct) {
        interfaceC02590Ai.AAP("product", AbstractC65993Txo.A00(musicProduct));
    }

    public static void A14(InterfaceC02590Ai interfaceC02590Ai, JIN jin) {
        interfaceC02590Ai.AAP("song_name", jin.getTitle());
    }

    public static void A15(InterfaceC02590Ai interfaceC02590Ai, JIN jin) {
        interfaceC02590Ai.AAP("artist_name", jin.getDisplayArtist());
    }

    public static void A16(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAK(C4SX.A00(str), "a_pk");
    }

    public static void A18(InterfaceC02590Ai interfaceC02590Ai, boolean z) {
        interfaceC02590Ai.A7v("is_album", Boolean.valueOf(z));
    }

    public static void A19(AbstractC02600Aj abstractC02600Aj, C22F c22f) {
        abstractC02600Aj.A0M(c22f.A0I(), "capture_type");
    }

    public static void A1C(AbstractC23721Ec abstractC23721Ec, C38321qM c38321qM) {
        abstractC23721Ec.A9s("media_id", c38321qM.getId());
    }

    public static void A1D(C006802i c006802i, String str, String str2, int i) {
        c006802i.markerAnnotate(i, str, str2);
        c006802i.markerEnd(i, (short) 3);
    }

    public static void A1H(CharSequence charSequence, InterfaceC09390do interfaceC09390do) {
        ((TextView) interfaceC09390do.getValue()).setText(charSequence);
    }

    public static void A1I(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 1;
    }

    public static void A1J(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 2;
    }

    public static void A1K(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 3;
    }

    public static void A1L(Enum r1, int[] iArr) {
        iArr[r1.ordinal()] = 4;
    }

    public static void A1Q(InterfaceC09390do interfaceC09390do) {
        ((AbstractC55352ga) interfaceC09390do.getValue()).DiZ();
    }

    public static boolean A1T(Context context, UserSession userSession) {
        return AbstractC195888lY.A01(context.getApplicationContext(), userSession);
    }

    public static boolean A1U(Resources resources, Object obj, int i) {
        return C14360o3.A0K(resources.getString(i), obj);
    }

    public static boolean A1Y(Object obj, Map map, float f) {
        return C14360o3.A0I((Float) map.get(obj), f);
    }

    public static Object[] A1b(C38321qM c38321qM) {
        return new Object[]{c38321qM.getId()};
    }
}
