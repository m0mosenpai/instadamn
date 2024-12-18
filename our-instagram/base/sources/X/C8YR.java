package X;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.sharetofriendsstory.v2.drawer.ShareToFriendsStoryDrawerController;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8YR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8YR implements InterfaceC1810781j {
    public final int A00;
    public final int A01;
    public final Activity A02;
    public final ViewGroup A03;
    public final AnonymousClass858 A04;
    public final AbstractC59962oe A05;
    public final UserSession A06;
    public final TouchInterceptorFrameLayout A07;
    public final C1810981l A08;
    public final C89F A09;
    public final C8RZ A0A;
    public final C187198Rm A0B;
    public final C8LZ A0C;
    public final C8TN A0D;
    public final C183688Ct A0E;
    public final C8MV A0F;
    public final C185948Mo A0G;
    public final C8NU A0H;
    public final TargetViewSizeProvider A0I;
    public final AnonymousClass874 A0J;
    public final AnonymousClass840 A0K;
    public final C81J A0L;
    public final C82D A0M;
    public final MagicMediaRemixEditController A0N;
    public final C187128Rf A0O;
    public final C8X5 A0P;
    public final C8XA A0Q;
    public final C8Y6 A0R;
    public final C8FG A0S;
    public final C188798Xv A0T;
    public final AnonymousClass877 A0U;
    public final AnonymousClass853 A0V;
    public final C8LC A0W;
    public final C8AD A0X;
    public final InterfaceC1810081c A0Y;
    public final ClipsTimelineEditorDrawerController A0Z;
    public final ClipsCreationViewModel A0a;
    public final C89E A0b;
    public final AnonymousClass856 A0c;
    public final C150286pc A0d;
    public final C150286pc A0e;
    public final ShareToFriendsStoryDrawerController A0f;
    public final InterfaceC08830cm A0g;
    public final C1812682c A0h;

    private C3AY A00() {
        C229019s c229019s = new C229019s(false);
        C229019s c229019s2 = new C229019s(false);
        UserSession userSession = this.A06;
        AnonymousClass840 anonymousClass840 = this.A0K;
        C187198Rm c187198Rm = this.A0B;
        C8LZ c8lz = this.A0C;
        C8NU c8nu = this.A0H;
        C8MV c8mv = this.A0F;
        C183688Ct c183688Ct = this.A0E;
        return AbstractC226729zU.A00(userSession, c187198Rm, c8lz, c8mv, c8nu, this.A0L.A0h, anonymousClass840, c183688Ct.A0V(), c229019s, c229019s2, c183688Ct.A0r());
    }

    private ArchivePendingUpload A01() {
        String A06;
        int i;
        int i2;
        int i3;
        boolean z;
        C1816783z c1816783z = this.A0K.A02;
        int ordinal = c1816783z.A01().ordinal();
        boolean z2 = false;
        if (ordinal != 0) {
            z2 = true;
            if (ordinal == 1) {
                C195868lW A04 = c1816783z.A01.A04();
                A04.getClass();
                A06 = A04.A0k;
                i = A04.A0K;
                i2 = A04.A08;
                i3 = A04.A09;
                z = A04.A1D;
            } else {
                throw new UnsupportedOperationException("Unknown media type");
            }
        } else {
            C183978Ee A03 = c1816783z.A01.A03();
            A03.getClass();
            A06 = A03.A06();
            i = A03.A09;
            i2 = A03.A06;
            i3 = A03.A07;
            z = A03.A14;
        }
        return new ArchivePendingUpload(A06, i, i2, i3, z2, z);
    }

    public static void A02(Intent intent, ShareMediaLoggingInfo shareMediaLoggingInfo, C8YR c8yr) {
        String str;
        long j;
        String str2;
        int i;
        PromptStickerModel promptStickerModel;
        C81J c81j = c8yr.A0L;
        SuperlativeStickerClientModel superlativeStickerClientModel = c81j.A16;
        if (superlativeStickerClientModel != null) {
            str = AbstractC47875LCv.A01(superlativeStickerClientModel.A00);
            if (C18U.A06(C06090Tz.A05, c8yr.A06, 36319394506743201L)) {
                shareMediaLoggingInfo.A04 = 30;
            }
        } else {
            str = null;
        }
        int intExtra = intent.getIntExtra("DirectPrivateStoryRecipientFragment.DIRECT_PRIVATE_STORY_SHARE_SHEET_TARGET", 0);
        long j2 = 0;
        long longExtra = intent.getLongExtra(MSV.A00(540), 0L);
        long longExtra2 = intent.getLongExtra(MSV.A00(539), 0L);
        long longExtra3 = intent.getLongExtra("upload_media_width", 0L);
        long longExtra4 = intent.getLongExtra("upload_media_height", 0L);
        int intExtra2 = intent.getIntExtra("exif_orientation", 0) % 180;
        if (intExtra2 == 0) {
            j = longExtra2;
        } else {
            j = longExtra;
        }
        Long valueOf = Long.valueOf(j);
        if (intExtra2 != 0) {
            longExtra = longExtra2;
        }
        List asList = Arrays.asList(valueOf, Long.valueOf(longExtra));
        List asList2 = Arrays.asList(Long.valueOf(longExtra4), Long.valueOf(longExtra3));
        ArrayList arrayList = new ArrayList();
        arrayList.add(asList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(asList2);
        List list = c8yr.A0K.A02.A01.A0n;
        List unmodifiableList = Collections.unmodifiableList(list);
        C14360o3.A07(unmodifiableList);
        Iterator it = unmodifiableList.iterator();
        long j3 = 0;
        while (it.hasNext()) {
            j3 += new File(((C198308pf) it.next()).A02()).length();
        }
        List unmodifiableList2 = Collections.unmodifiableList(list);
        C14360o3.A07(unmodifiableList2);
        Iterator it2 = unmodifiableList2.iterator();
        long j4 = 0;
        while (it2.hasNext()) {
            if (((C198308pf) it2.next()).A03 != null) {
                j4 += r2.A07;
            }
        }
        if (j4 != 0) {
            j2 = (j3 / j4) * 8000;
        }
        List unmodifiableList3 = Collections.unmodifiableList(list);
        C14360o3.A07(unmodifiableList3);
        String A02 = ((C198308pf) unmodifiableList3.get(0)).A02();
        C1816683y c1816683y = c81j.A12;
        if (c1816683y != null && (promptStickerModel = c1816683y.A01) != null) {
            str2 = promptStickerModel.A03;
        } else {
            str2 = null;
        }
        UserSession userSession = c8yr.A06;
        C14360o3.A0B(userSession, 0);
        if (intExtra != 0 && intExtra != 2) {
            if (intExtra == 1) {
                i = 2;
            } else {
                i = -1;
                if (intExtra == 3) {
                    i = 8;
                }
            }
        } else {
            i = 1;
        }
        EnumC53371NjM A07 = AbstractC50677MYv.A07(i);
        C1810981l c1810981l = c8yr.A08;
        AbstractC50677MYv.A0E(A07, userSession, (C55U) c1810981l.A08.A00, shareMediaLoggingInfo, c8yr.A0I, Boolean.valueOf(c8yr.A0E.A1E.A03.A0G), c1810981l.A0A(), Long.valueOf(j2), c8yr.A0h.getModuleName(), str, A02, str2, new ArrayList((Collection) c1810981l.A09.A00), arrayList, arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x091c, code lost:
    
        if (r11.equals(r3.getId()) == false) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x09e8, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5, 2342154883232170792L) != false) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0ad3, code lost:
    
        if (java.lang.Boolean.valueOf(r0).booleanValue() == false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0ad5, code lost:
    
        r3 = java.lang.Boolean.valueOf(r4).booleanValue();
        X.C14360o3.A0B(r5, 0);
        r10 = new X.C214959fX();
        r10.A01 = r20;
        r10.A00 = r9;
        r4 = new android.os.Bundle();
        X.AbstractC60492pY.A04(r4, r5);
        r4.putParcelable("DirectPrivateStoryRecipientFragment.INGEST_SESSION", r13);
        r4.putParcelable("DirectPrivateStoryRecipientFragment.INGEST_SESSION_FOR_DIRECT", null);
        r4.putParcelable("bundle_extra_archive_pending_upload", r19);
        r4.putBoolean("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHARE_TO_FB", r18);
        r4.putBoolean("DirectPrivateStoryRecipientFragment.DIRECT_IS_MULTI_CAPTURE", r11);
        r4.putParcelable("target_group_profile_recipient", r3);
        r4.putBoolean("DirectPrivateStoryRecipientFragment.SHARE_TO_FRIENDS_STORY_TARGET_ENABLED", r3);
        r10.setArguments(r4);
        r6 = new X.C189448aO(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0b1e, code lost:
    
        if (r15 == false) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0b20, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0b21, code lost:
    
        r6.A0d = r0;
        r6.A1R = r15;
        r6.A0U = r10;
        r6.A0X = new X.C221379q1(r63);
        r6.A1O = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0b3b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5, 36327718153304890L) == false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0b41, code lost:
    
        if (X.C57992lC.A03() == false) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0b43, code lost:
    
        r3 = X.C57992lC.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0b47, code lost:
    
        r6.A0G = new android.graphics.Rect(0, 0, 0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0b63, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0b4e, code lost:
    
        r6.A00().A02(r7, r10);
        r9.D2U(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0b58, code lost:
    
        if (r11 == false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0b5a, code lost:
    
        r63.A0B.A0c.A0C(false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0b65, code lost:
    
        r0 = r7.getString(2131973639);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0b76, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0b74, code lost:
    
        if (r0.A04 != null) goto L370;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0901 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0214  */
    /* JADX WARN: Type inference failed for: r5v20, types: [androidx.fragment.app.Fragment, X.BBy, X.2oe] */
    @Override // X.InterfaceC1810781j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void DoV(java.lang.Object r64, java.lang.Object r65, java.lang.Object r66) {
        /*
            Method dump skipped, instructions count: 3196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8YR.DoV(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    public C8YR(ViewGroup viewGroup, AnonymousClass858 anonymousClass858, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C1810981l c1810981l, C89F c89f, C8RZ c8rz, C187198Rm c187198Rm, C8LZ c8lz, C8TN c8tn, C183688Ct c183688Ct, C8MV c8mv, C185948Mo c185948Mo, C8NU c8nu, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass874 anonymousClass874, AnonymousClass840 anonymousClass840, C81J c81j, C82D c82d, C1812682c c1812682c, MagicMediaRemixEditController magicMediaRemixEditController, C187128Rf c187128Rf, C8X5 c8x5, C8XA c8xa, C8Y6 c8y6, C8FG c8fg, C188798Xv c188798Xv, AnonymousClass877 anonymousClass877, AnonymousClass853 anonymousClass853, C8LC c8lc, C8AD c8ad, InterfaceC1810081c interfaceC1810081c, ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController, ClipsCreationViewModel clipsCreationViewModel, C89E c89e, AnonymousClass856 anonymousClass856, C150286pc c150286pc, C150286pc c150286pc2, ShareToFriendsStoryDrawerController shareToFriendsStoryDrawerController, InterfaceC08830cm interfaceC08830cm, int i, int i2) {
        this.A0L = c81j;
        this.A06 = c81j.A0S;
        this.A02 = c81j.A05;
        c81j.A0M.getClass();
        this.A05 = c81j.A0M;
        this.A0K = anonymousClass840;
        this.A0Y = interfaceC1810081c;
        this.A0D = c8tn;
        this.A0M = c82d;
        this.A0O = c187128Rf;
        this.A09 = c89f;
        this.A0U = anonymousClass877;
        this.A0f = shareToFriendsStoryDrawerController;
        this.A0e = c150286pc;
        this.A0A = c8rz;
        this.A0Z = clipsTimelineEditorDrawerController;
        this.A0E = c183688Ct;
        this.A0T = c188798Xv;
        this.A0b = c89e;
        this.A08 = c1810981l;
        this.A0R = c8y6;
        this.A0a = clipsCreationViewModel;
        this.A0g = interfaceC08830cm;
        this.A0Q = c8xa;
        this.A0H = c8nu;
        this.A0W = c8lc;
        this.A0X = c8ad;
        this.A0B = c187198Rm;
        this.A0C = c8lz;
        this.A0F = c8mv;
        this.A0S = c8fg;
        this.A04 = anonymousClass858;
        this.A0c = anonymousClass856;
        this.A03 = viewGroup;
        this.A0V = anonymousClass853;
        this.A07 = touchInterceptorFrameLayout;
        this.A01 = i;
        this.A00 = i2;
        this.A0J = anonymousClass874;
        this.A0I = targetViewSizeProvider;
        this.A0h = c1812682c;
        this.A0G = c185948Mo;
        this.A0P = c8x5;
        this.A0d = c150286pc2;
        this.A0N = magicMediaRemixEditController;
    }
}
