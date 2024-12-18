package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.22F, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C22F {
    public static final InterfaceC11380iw A08 = new C19270xB("ig_camera_client_events");
    public static final InterfaceC11380iw A09 = new C19270xB("clips_timeline_editor");
    public final C006802i A00;
    public final C18920wW A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final C22M A04;
    public final C24M A05;
    public final C24O A06;
    public final C24P A07;

    public static final C9Vb A0E(C81W c81w, C1810981l c1810981l, int i) {
        double d;
        long j;
        int i2;
        C14360o3.A0B(c81w, 0);
        C9Vb c9Vb = new C9Vb();
        c9Vb.A01(c81w.A00, "tool");
        c9Vb.A05("segment_index", Long.valueOf(i));
        int ordinal = c81w.ordinal();
        if (ordinal != 14) {
            if (ordinal != 8) {
                if (ordinal == 10) {
                    if (c1810981l != null) {
                        i2 = c1810981l.A06(c81w);
                    } else {
                        i2 = -1;
                    }
                    EnumC1828489f enumC1828489f = (EnumC1828489f) AbstractC001800i.A0O(AbstractC171697kz.A01(), i2);
                    if (enumC1828489f == null) {
                        enumC1828489f = EnumC1828489f.A09;
                    }
                    c9Vb.A04("speed_selector", Double.valueOf(enumC1828489f.A00));
                }
                return c9Vb;
            }
            if (c1810981l != null) {
                j = c1810981l.A07(c81w);
            } else {
                j = -1;
            }
            c9Vb.A05("duration_selector_s", Long.valueOf(j / 1000));
            return c9Vb;
        }
        if (c1810981l != null) {
            d = c1810981l.A07(c81w);
        } else {
            d = -1.0d;
        }
        c9Vb.A06("timer_selector_s", String.valueOf(d / 1000.0d));
        return c9Vb;
    }

    public static final boolean A0H(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((Folder) it.next()).A03;
            if (str != null && (str.equals(WearableMediaDownloadManager.MODEL_FIELD_STELLA_PHOTO) || str.equals("Facebook View") || str.equals("Meta View"))) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0Q(String str) {
        if (this.A04.A0L == null) {
            AbstractC12120kG.A08("IgCameraBaseFalcoLoggerImpl", AnonymousClass001.A0R(str, " cameraSession is null"), null);
            return false;
        }
        return true;
    }

    public static final Long A0F(String str) {
        if (str != null) {
            return AbstractC003100w.A0k(10, str);
        }
        return null;
    }

    public static final ArrayList A0G(List list, List list2) {
        if (list2 != null && !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList(list);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C81X c81x = (C81X) it.next();
                C9Vb c9Vb = new C9Vb();
                c9Vb.A01(c81x, "tool");
                arrayList.add(c9Vb);
            }
            return arrayList;
        }
        return AbstractC001800i.A0U(list);
    }

    public final EnumC193318hB A0I() {
        Integer num;
        int A00;
        C22M c22m = this.A04;
        EnumC193318hB enumC193318hB = c22m.A07;
        if (enumC193318hB == null) {
            C1810981l c1810981l = c22m.A0E;
            if (c1810981l == null || (num = c1810981l.A0A()) == null) {
                num = C05F.A0C;
            }
            int i = c22m.A00;
            if (i == -1) {
                A00 = AbstractC449424y.A01(num);
            } else {
                A00 = AbstractC449424y.A00(this.A03, num, i);
            }
            return EnumC193318hB.values()[A00 - 1];
        }
        return enumC193318hB;
    }

    public final EnumC114925Hg A0J() {
        C55U c55u;
        C22M c22m = this.A04;
        EnumC114925Hg enumC114925Hg = c22m.A08;
        if (enumC114925Hg == null) {
            C1810981l c1810981l = c22m.A0E;
            if (c1810981l == null) {
                c55u = C82X.A00(this.A03).A00;
                if (c55u == null) {
                    AbstractC12120kG.A08("IgCameraBaseFalcoLoggerImpl", "currentCameraDestination is null", null);
                    return null;
                }
            } else if (!c22m.A0W && c22m.A09 != C22P.A15) {
                c55u = (C55U) c1810981l.A08.A00;
            } else {
                return EnumC114925Hg.CLIPS;
            }
            return c55u.A00;
        }
        return enumC114925Hg;
    }

    public final C51414MnM A0K() {
        C51414MnM c51414MnM = new C51414MnM();
        c51414MnM.A01(A0J(), "product_type");
        C22M c22m = this.A04;
        c51414MnM.A01(c22m.A0A, "media_type");
        ArrayList arrayList = new ArrayList();
        C1810981l c1810981l = c22m.A0E;
        if (c1810981l != null) {
            Iterator it = c1810981l.A09((C55U) c1810981l.A08.A00).A00().iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                C14360o3.A07(next);
                C81W c81w = (C81W) next;
                if (c1810981l.A0W(c81w)) {
                    C14360o3.A0B(c81w, 0);
                    C211039Vc c211039Vc = new C211039Vc();
                    c211039Vc.A01(c81w.A00, "tool");
                    int ordinal = c81w.ordinal();
                    if (ordinal != 14) {
                        if (ordinal != 8) {
                            if (ordinal == 10) {
                                EnumC1828489f enumC1828489f = (EnumC1828489f) AbstractC001800i.A0O(AbstractC171697kz.A01(), c1810981l.A06(c81w));
                                if (enumC1828489f == null) {
                                    enumC1828489f = EnumC1828489f.A09;
                                }
                                c211039Vc.A04("speed_selector", Double.valueOf(enumC1828489f.A00));
                            }
                        } else {
                            c211039Vc.A05("duration_selector_s", Long.valueOf(c1810981l.A07(c81w) / 1000));
                        }
                    } else {
                        c211039Vc.A06("timer_selector_s", String.valueOf(c1810981l.A07(c81w) / 1000.0d));
                    }
                    arrayList.add(c211039Vc);
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("mCameraConfigurationRepository is null on Entrypoint ");
            sb.append(Long.valueOf(c22m.A09.A00));
            AbstractC12120kG.A08("IgCameraBaseFalcoLoggerImpl", sb.toString(), null);
        }
        c51414MnM.A07("camera_tools", arrayList);
        return c51414MnM;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C51414MnM A0L(Pair pair, Boolean bool, Integer num, String str, String str2, List list, List list2, List list3, List list4, int i) {
        VHm vHm;
        String str3;
        Object c09540e5;
        String str4;
        Long l;
        Long l2;
        Long l3;
        long j;
        long j2;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                C14360o3.A0B(str5, 0);
                Long A0k = AbstractC003100w.A0k(10, str5);
                C0Zx c0Zx = new C0Zx() { // from class: X.9VZ
                };
                if (A0k != null) {
                    j2 = A0k.longValue();
                } else {
                    j2 = -1;
                }
                c0Zx.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(j2));
                c0Zx.A00.put("surface_when_applied", 1);
                arrayList.add(c0Zx);
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String str6 = (String) it2.next();
                C14360o3.A0B(str6, 0);
                Long A0k2 = AbstractC003100w.A0k(10, str6);
                C0Zx c0Zx2 = new C0Zx() { // from class: X.9VZ
                };
                if (A0k2 != null) {
                    j = A0k2.longValue();
                } else {
                    j = -1;
                }
                c0Zx2.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(j));
                c0Zx2.A00.put("surface_when_applied", 2);
                arrayList.add(c0Zx2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = null;
        if (str != null) {
            C0Zx c0Zx3 = new C0Zx() { // from class: X.9VY
            };
            c0Zx3.A05("asset_id", AbstractC003100w.A0k(10, str));
            if (str2 != null) {
                l3 = AbstractC003100w.A0k(10, str2);
            } else {
                l3 = null;
            }
            c0Zx3.A05("audio_cluster_id", l3);
            arrayList2.add(c0Zx3);
        }
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Pair pair2 = (Pair) it3.next();
                if (!C14360o3.A0K(pair2.first, str)) {
                    C0Zx c0Zx4 = new C0Zx() { // from class: X.9VY
                    };
                    String str7 = (String) pair2.first;
                    if (str7 != null) {
                        l = AbstractC003100w.A0k(10, str7);
                    } else {
                        l = null;
                    }
                    c0Zx4.A05("asset_id", l);
                    String str8 = (String) pair2.second;
                    if (str8 != null) {
                        l2 = AbstractC003100w.A0k(10, str8);
                    } else {
                        l2 = null;
                    }
                    c0Zx4.A05("audio_cluster_id", l2);
                    arrayList2.add(c0Zx4);
                }
            }
        }
        List<C81X> A0W = AbstractC001800i.A0W(list4);
        ArrayList arrayList4 = new ArrayList(AbstractC06950Ym.A1E(A0W, 10));
        for (C81X c81x : A0W) {
            C211039Vc c211039Vc = new C211039Vc();
            c211039Vc.A01(c81x, "tool");
            arrayList4.add(c211039Vc);
        }
        if (pair != null) {
            ArrayList arrayList5 = new ArrayList();
            int size = ((List) pair.first).size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = pair.first;
                C14360o3.A06(obj);
                String str9 = (String) AbstractC001800i.A0O((List) obj, i2);
                if (str9 != null) {
                    C9Va c9Va = new C9Va();
                    c9Va.A06("str_id", str9);
                    int i3 = 3;
                    if (i != 2) {
                        if (i != 3) {
                            i3 = 1;
                        }
                    } else {
                        i3 = 2;
                    }
                    c9Va.A00.put("surface", Integer.valueOf(i3));
                    List list5 = (List) pair.second;
                    if (list5 != null && (str4 = (String) AbstractC001800i.A0O(list5, i2)) != null) {
                        str3 = str4.toUpperCase(Locale.ROOT);
                        C14360o3.A07(str3);
                    } else {
                        str3 = "";
                    }
                    try {
                        c09540e5 = VHl.valueOf(str3);
                    } catch (Throwable th) {
                        c09540e5 = new C09540e5(th);
                    }
                    if (c09540e5 instanceof C09540e5) {
                        c09540e5 = null;
                    }
                    c9Va.A01((VHl) ((Enum) c09540e5), "sticker_type");
                    arrayList5.add(c9Va);
                }
            }
            arrayList3 = arrayList5;
        }
        C51414MnM c51414MnM = new C51414MnM();
        c51414MnM.A01(A0J(), "product_type");
        c51414MnM.A01(this.A04.A0A, "media_type");
        c51414MnM.A03("from_draft", bool);
        c51414MnM.A07("effects", arrayList);
        c51414MnM.A07(MediaStreamTrack.AUDIO_TRACK_KIND, arrayList2);
        c51414MnM.A07("camera_tools", arrayList4);
        c51414MnM.A07("stickers", arrayList3);
        if (num != null) {
            String A00 = C6Q1.A00(null, num.intValue());
            switch (A00.hashCode()) {
                case -417107865:
                    if (A00.equals("reel_reshare")) {
                        vHm = VHm.A0K;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case -391366677:
                    if (A00.equals("feed_reshare")) {
                        vHm = VHm.A0D;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 48:
                    if (A00.equals("0")) {
                        vHm = VHm.A0H;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 49:
                    if (A00.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                        vHm = VHm.A0C;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 51:
                    if (A00.equals("3")) {
                        vHm = VHm.A08;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 52:
                    if (A00.equals("4")) {
                        vHm = VHm.A09;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 53:
                    if (A00.equals("5")) {
                        vHm = VHm.A0B;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 54:
                    if (A00.equals("6")) {
                        vHm = VHm.A0A;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 57:
                    if (A00.equals("9")) {
                        vHm = VHm.A0L;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 1607:
                    if (A00.equals("29")) {
                        vHm = VHm.A06;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 1629:
                    if (A00.equals("30")) {
                        vHm = VHm.A05;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 1631:
                    if (A00.equals("32")) {
                        vHm = VHm.A0G;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 1634:
                    if (A00.equals("35")) {
                        vHm = VHm.A0M;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 1660:
                    if (A00.equals("40")) {
                        vHm = VHm.A04;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 1668:
                    if (A00.equals("48")) {
                        vHm = VHm.A0N;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 1691:
                    if (A00.equals("50")) {
                        vHm = VHm.A0E;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 1692:
                    if (A00.equals("51")) {
                        vHm = VHm.A03;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 1693:
                    if (A00.equals("52")) {
                        vHm = VHm.A02;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 1695:
                    if (A00.equals("54")) {
                        vHm = VHm.A0I;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 48633:
                    if (A00.equals("108")) {
                        vHm = VHm.A0F;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 48634:
                    if (A00.equals("109")) {
                        vHm = VHm.A0J;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                case 50549:
                    if (A00.equals("302")) {
                        vHm = VHm.A07;
                        break;
                    }
                    vHm = VHm.A0O;
                    break;
                default:
                    vHm = VHm.A0O;
                    break;
            }
            c51414MnM.A01(vHm, "source_ig_string");
        }
        return c51414MnM;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zx, X.9W7] */
    public final C9W7 A0M() {
        ?? r3 = new C0Zx() { // from class: X.9W7
        };
        C22M c22m = this.A04;
        String str = c22m.A0L;
        if (str == null) {
            str = "";
        }
        r3.A06("camera_session_id", str);
        EnumC114925Hg A0J = A0J();
        if (A0J == null) {
            A0J = EnumC114925Hg.NONE;
        }
        r3.A01(A0J, "camera_destination");
        r3.A01(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        r3.A06("module", A08.getModuleName());
        EnumC50631MWs enumC50631MWs = c22m.A0C;
        if (enumC50631MWs == null) {
            enumC50631MWs = EnumC50631MWs.A0F;
        }
        r3.A01(enumC50631MWs, "surface");
        r3.A07("bottom_camera_dial", C16930sl.A00);
        return r3;
    }

    public final ArrayList A0N(int i) {
        ArrayList arrayList = new ArrayList();
        C22M c22m = this.A04;
        C1810981l c1810981l = c22m.A0E;
        if (c1810981l != null) {
            Iterator it = c1810981l.A09((C55U) c1810981l.A08.A00).A00().iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                C14360o3.A07(next);
                C81W c81w = (C81W) next;
                if (c1810981l.A0W(c81w)) {
                    arrayList.add(A0E(c81w, c1810981l, i));
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("mCameraConfigurationRepository is null on Entrypoint ");
            sb.append(Long.valueOf(c22m.A09.A00));
            AbstractC12120kG.A08("IgCameraBaseFalcoLoggerImpl", sb.toString(), null);
        }
        return arrayList;
    }

    public final ArrayList A0O(List list, List list2, List list3, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C81W c81w = (C81W) it.next();
                C14360o3.A0B(c81w, 0);
                arrayList.add(c81w.A00);
            }
        }
        C22M c22m = this.A04;
        C1810981l c1810981l = c22m.A0E;
        if (c1810981l != null) {
            for (C81W c81w2 : (java.util.Set) c1810981l.A09.A00) {
                C14360o3.A0B(c81w2, 0);
                C81X c81x = c81w2.A00;
                if (!arrayList.contains(c81x)) {
                    arrayList.add(c81x);
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("mCameraConfigurationRepository is null on Entrypoint ");
            sb.append(Long.valueOf(c22m.A09.A00));
            AbstractC12120kG.A08("IgCameraBaseFalcoLoggerImpl", sb.toString(), null);
        }
        if (z) {
            if (c1810981l != null) {
                Iterator it2 = c1810981l.A09((C55U) c1810981l.A08.A00).A00().iterator();
                C14360o3.A07(it2);
                while (it2.hasNext()) {
                    Object next = it2.next();
                    C14360o3.A07(next);
                    C81W c81w3 = (C81W) next;
                    if (c1810981l.A0W(c81w3)) {
                        C14360o3.A0B(c81w3, 0);
                        arrayList.add(c81w3.A00);
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mCameraConfigurationRepository is null on Entrypoint ");
                sb2.append(Long.valueOf(c22m.A09.A00));
                AbstractC12120kG.A08("IgCameraBaseFalcoLoggerImpl", sb2.toString(), null);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                C5JB c5jb = (C5JB) it3.next();
                try {
                    String str = c5jb.A01.A00;
                    C14360o3.A0B(str, 0);
                    C81X A06 = AbstractC449424y.A06(AbstractC003100w.A0k(10, str));
                    if (A06 != null) {
                        arrayList2.add(A06);
                    }
                } catch (NumberFormatException unused) {
                    AbstractC12120kG.A07("IgCameraLoggingUtil", AnonymousClass001.A0R("Camera Tool has non-numeric value: ", c5jb.A01.A00), null);
                }
            }
        }
        arrayList.addAll(arrayList2);
        Collection A0F = AbstractC449424y.A0F(list3);
        if (A0F == null) {
            A0F = C16930sl.A00;
        }
        arrayList.addAll(A0F);
        if (z2) {
            arrayList.add(C81W.A0T.A00);
        }
        return arrayList;
    }

    public final boolean A0P() {
        C22M c22m = this.A04;
        String str = "";
        if (c22m.A0C == null) {
            str = AnonymousClass001.A0R("", "surface has not been updated\n ");
        }
        if (c22m.A0L == null) {
            str = AnonymousClass001.A0R(str, "camera session is not set\n ");
        }
        if (c22m.A0E == null) {
            str = AnonymousClass001.A0R(str, "mCameraConfigurationRepository module is not set\n ");
        }
        if (str.length() <= 0) {
            return true;
        }
        AbstractC12120kG.A08("IgCameraBaseFalcoLoggerImpl", str, null);
        return false;
    }

    public C22F(UserSession userSession, C22M c22m) {
        this.A03 = userSession;
        this.A04 = c22m;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A00 = c006802i;
        this.A01 = AbstractC12220kQ.A01(A08, userSession);
        this.A02 = AbstractC12220kQ.A01(A09, userSession);
        this.A05 = new C24M() { // from class: X.24L
            @Override // X.C24M
            public final EnumC114925Hg Ajy() {
                EnumC114925Hg A0J = C22F.this.A0J();
                if (A0J == null) {
                    return EnumC114925Hg.NONE;
                }
                return A0J;
            }

            @Override // X.C24M
            public final String Ak5() {
                String str = C22F.this.A04.A0L;
                if (str == null) {
                    return "";
                }
                return str;
            }

            @Override // X.C24M
            public final C22P B2Q() {
                return C22F.this.A04.A09;
            }

            @Override // X.C24M
            public final EnumC50631MWs C4H() {
                C22M c22m2 = C22F.this.A04;
                EnumC50631MWs enumC50631MWs = c22m2.A0B;
                if (enumC50631MWs == null) {
                    EnumC50631MWs enumC50631MWs2 = c22m2.A0C;
                    if (enumC50631MWs2 == null) {
                        return EnumC50631MWs.A0F;
                    }
                    return enumC50631MWs2;
                }
                return enumC50631MWs;
            }
        };
        this.A06 = new C24O() { // from class: X.24N
            @Override // X.C24O
            public final String BWE() {
                return C1QM.A00.A02.A00;
            }
        };
        this.A07 = new C24P(this);
    }
}
