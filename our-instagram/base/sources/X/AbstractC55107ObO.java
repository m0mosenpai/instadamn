package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.CommentPromptImpl;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.feed.media.CameraToolInfo;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.venue.LocationDict;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ObO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55107ObO {
    public static final Integer A00(C9JS c9js, C5JK c5jk, String str, String str2, List list) {
        EnumC189548aZ enumC189548aZ;
        AbstractC25233BEq.A0v(0, list, str, c5jk);
        if (list.isEmpty()) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Error: draft video segment is empty, session id ");
            A1C.append(str);
            AbstractC12120kG.A06(str2, AbstractC167017dG.A0n(c5jk, ", clips creation type ", A1C), null);
            return null;
        }
        int i = 0;
        if (c9js != null && (enumC189548aZ = c9js.A06) != null && enumC189548aZ == EnumC189548aZ.A07 && list.size() > 1) {
            i = 1;
        }
        return Integer.valueOf(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r2.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(com.instagram.api.schemas.MediaCroppingCoordinates r6, X.C128175qm r7, X.C47Z r8, boolean r9, boolean r10) {
        /*
            r5 = 0
            r4 = 1
            r8.A0M()
            java.util.List r2 = r7.A0t
            if (r2 == 0) goto L10
            boolean r1 = r2.isEmpty()
            r0 = 0
            if (r1 == 0) goto L11
        L10:
            r0 = 1
        L11:
            r3 = 0
            if (r0 != 0) goto L44
            r8.A4w = r4
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r1 = r2.next()
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r1
            boolean r0 = r1.A0Q
            if (r0 == 0) goto L3f
            java.lang.String r1 = r1.getId()
        L2e:
            X.5Kx r0 = new X.5Kx
            r0.<init>()
            r0.A05 = r9
            r0.A01 = r6
            r0.A04 = r10
            r0.A02 = r1
            r8.A0Y(r0)
            goto L1a
        L3f:
            r1 = r3
            goto L2e
        L41:
            r8.A5Q = r4
            return
        L44:
            r8.A4w = r5
            r8.A5Q = r5
            X.5Kx r0 = new X.5Kx
            r0.<init>()
            r0.A05 = r9
            r0.A01 = r6
            r0.A04 = r10
            r0.A02 = r3
            r8.A0Y(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55107ObO.A02(com.instagram.api.schemas.MediaCroppingCoordinates, X.5qm, X.47Z, boolean, boolean):void");
    }

    public static final void A03(UserSession userSession, C128175qm c128175qm, C47Z c47z, String str) {
        Integer num;
        EnumC114925Hg enumC114925Hg;
        String str2;
        String str3;
        AudioOverlayTrack audioOverlayTrack;
        InstagramAudioApplySource instagramAudioApplySource;
        AudioOverlayTrack audioOverlayTrack2;
        String str4;
        C38698H2j c38698H2j;
        Long l;
        String str5 = str;
        C14360o3.A0B(userSession, 0);
        ShareMediaLoggingInfo shareMediaLoggingInfo = c128175qm.A0B;
        if (shareMediaLoggingInfo != null) {
            num = Integer.valueOf(shareMediaLoggingInfo.A00);
        } else {
            num = null;
        }
        c47z.A26 = num;
        c47z.A2w = c128175qm.A0X;
        c47z.A4y = c128175qm.A11;
        c47z.A5a = c128175qm.A14;
        c47z.A5s = c128175qm.A16;
        c47z.A5Y = c128175qm.A13;
        c47z.A54 = c128175qm.A0w;
        c47z.A62 = AbstractC75343a1.A06(userSession);
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        c47z.A6A = A0x.getBoolean("translate_captions_for_video", C18U.A06(c06090Tz, userSession, 36322860544961220L));
        c47z.A6B = AbstractC166987dD.A0x(userSession).getBoolean("translate_stickers", C18U.A06(c06090Tz, userSession, 36322937854700295L));
        C5Kv c5Kv = c47z.A1O;
        if (c5Kv != null && (l = c5Kv.A01) != null && C51T.A00(AbstractC43592JPx.A0y(l)) == CameraTool.A1D) {
            c47z.A3a = c128175qm.A0T;
        }
        c47z.A2c = c128175qm.A0T;
        c47z.A5A = c128175qm.A0y;
        if (c128175qm.A0H == C5JK.A06) {
            enumC114925Hg = EnumC114925Hg.FEED;
        } else {
            enumC114925Hg = EnumC114925Hg.CLIPS;
        }
        c47z.A0h = enumC114925Hg;
        C110204xp c110204xp = c128175qm.A08;
        if (c110204xp != null && (c38698H2j = c110204xp.A01) != null) {
            str2 = c38698H2j.A00;
        } else {
            str2 = null;
        }
        c47z.A3f = str2;
        Collection collection = c128175qm.A0q;
        if (collection == null) {
            collection = C16930sl.A00;
        }
        ArrayList A1F = AbstractC166987dD.A1F(collection);
        C14360o3.A0B(A1F, 0);
        c47z.A40 = A1F;
        C101394gx c101394gx = c128175qm.A0O;
        if (c101394gx != null && AbstractC50595MVg.A00(userSession)) {
            c47z.A0u = AbstractC33671EuL.A00(C35104Fe6.A00().A00, c101394gx);
        }
        if (c128175qm.A0x) {
            c47z.A0u = AbstractC33671EuL.A00(new CommentPromptImpl(null, null), C35104Fe6.A00().A01);
            CameraToolInfo cameraToolInfo = new CameraToolInfo(CameraTool.A0Z, null, null, null);
            ArrayList A0U = AbstractC001800i.A0U(c47z.A4D);
            A0U.add(A08.A00(cameraToolInfo, 0));
            c47z.A4D = A0U;
        }
        List list = c128175qm.A0n;
        if (list != null && !list.isEmpty() && !(list instanceof ArrayList) && C18U.A06(c06090Tz, userSession, 36325459000046684L)) {
            c47z.A4L = list;
        } else {
            if (!(list instanceof ArrayList) || list == null) {
                list = AbstractC166987dD.A1E();
            }
            c47z.A4L = list;
        }
        c47z.A2d = c128175qm.A0U;
        EnumC76383bi enumC76383bi = c128175qm.A0K;
        if (enumC76383bi != null && c47z.A1F != EnumC76383bi.A07) {
            c47z.A1F = enumC76383bi;
        }
        LocationDict locationDict = c128175qm.A0L;
        if (locationDict != null) {
            c47z.A1H = locationDict;
        }
        if (c47z.A3n == null) {
            if (c110204xp != null) {
                str4 = Long.valueOf(c110204xp.A00).toString();
            } else {
                str4 = null;
            }
            c47z.A3n = str4;
        }
        String str6 = c128175qm.A0b;
        if (str6 != null) {
            int A04 = AbstractC001900j.A04(str6, '_', 0);
            if (A04 != -1) {
                str6 = AbstractC25227BEk.A0w(str6, 0, A04);
            }
        } else {
            str6 = null;
        }
        c47z.A3P = str6;
        c47z.A6D = c128175qm.A19;
        ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel = c128175qm.A0R;
        if (existingStandaloneFundraiserForFeedModel != null) {
            c47z.A2x = existingStandaloneFundraiserForFeedModel.A03;
            c47z.A2y = c128175qm.A0Y;
        } else {
            NewFundraiserInfo newFundraiserInfo = c128175qm.A0J;
            if (newFundraiserInfo != null) {
                String str7 = newFundraiserInfo.A02;
                int i = newFundraiserInfo.A00;
                String str8 = newFundraiserInfo.A05;
                String str9 = newFundraiserInfo.A07;
                boolean z = newFundraiserInfo.A09;
                if (str == null && (str5 = c128175qm.A0S) == null) {
                    str5 = "";
                }
                c47z.A1E = new NewFundraiserInfo(str7, str8, str9, str5, "REELS", newFundraiserInfo.A01, null, null, newFundraiserInfo.A08, i, z);
                c47z.A2y = c128175qm.A0Y;
            }
        }
        c47z.A3G = c128175qm.A0f;
        UpcomingEventImpl upcomingEventImpl = c128175qm.A0Q;
        UpcomingEventImpl upcomingEventImpl2 = null;
        if (upcomingEventImpl != null) {
            upcomingEventImpl2 = upcomingEventImpl.F7b(null);
        }
        c47z.A1p = upcomingEventImpl2;
        c47z.A3A = c128175qm.A0d;
        c47z.A6E = c128175qm.A1A;
        c47z.A0k = new C9C9(c128175qm.A0Z, c128175qm.A0a, 10);
        AudioOverlayTrack audioOverlayTrack3 = c128175qm.A0N;
        if (audioOverlayTrack3 == null || (str3 = audioOverlayTrack3.A0C) == null) {
            List list2 = c128175qm.A0p;
            if (list2 != null && (audioOverlayTrack = (AudioOverlayTrack) AbstractC001800i.A0J(list2)) != null) {
                str3 = audioOverlayTrack.A0C;
            } else {
                str3 = null;
            }
        }
        c47z.A2P = str3;
        if (audioOverlayTrack3 == null || (instagramAudioApplySource = audioOverlayTrack3.A07) == null) {
            List list3 = c128175qm.A0p;
            if (list3 != null && (audioOverlayTrack2 = (AudioOverlayTrack) AbstractC001800i.A0J(list3)) != null) {
                instagramAudioApplySource = audioOverlayTrack2.A07;
            } else {
                instagramAudioApplySource = null;
            }
        }
        c47z.A1I = instagramAudioApplySource;
        E72 e72 = c128175qm.A03;
        if (e72 != null) {
            c47z.A0m = e72;
        }
        if (c47z.A1F == EnumC76383bi.A0C) {
            ArrayList A1F2 = AbstractC166987dD.A1F(C16930sl.A00);
            C14360o3.A0B(A1F2, 0);
            c47z.A40 = A1F2;
            c47z.A2d = null;
            c47z.A4L = AbstractC166987dD.A1E();
            c47z.A2x = null;
            c47z.A1q = null;
            c47z.A1E = null;
        }
        C51685MsG c51685MsG = c128175qm.A0I;
        if (c51685MsG != null) {
            c47z.A1B = c51685MsG;
        }
        C51756Mtf c51756Mtf = c128175qm.A02;
        if (c51756Mtf != null) {
            c47z.A0l = c51756Mtf;
        }
    }

    public static final void A01(Context context, MediaCroppingCoordinates mediaCroppingCoordinates, UserSession userSession, C128175qm c128175qm, InterfaceC37150GYl interfaceC37150GYl, InterfaceC58038PoO interfaceC58038PoO, C47Z c47z, String str, boolean z, boolean z2) {
        boolean z3;
        C9JS c9js;
        C5NL A00;
        Al8 al8;
        Medium medium;
        AbstractC167017dG.A1Q(userSession, c47z);
        A02(mediaCroppingCoordinates, c128175qm, c47z, z, z2);
        A03(userSession, c128175qm, c47z, str);
        C54718OEv c54718OEv = new C54718OEv(context, userSession, c128175qm, c47z);
        C47Z c47z2 = c54718OEv.A07;
        List list = c47z2.A4a;
        if (list != null && AbstractC166987dD.A1b(list) && (c9js = c54718OEv.A06.A0E) != null) {
            c54718OEv.A01 = c9js;
            List list2 = c47z2.A4a;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C5NM c5nm = ((C5NJ) it.next()).A04;
                    if (c5nm != null && (A00 = c5nm.A00()) != null && (A00 instanceof Al8) && ((medium = (al8 = (Al8) A00).A06) == null || TextUtils.isEmpty(medium.A0X) || !MSY.A1Z(al8.A06.A0X))) {
                        if (al8.A06.Cff()) {
                            c54718OEv.A00 = al8;
                            z3 = true;
                            break;
                        }
                    }
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        z3 = false;
        c54718OEv.A03 = z3;
        if (z3) {
            interfaceC58038PoO.Elv();
            c54718OEv.A02 = new FIN(interfaceC37150GYl, interfaceC58038PoO);
            if (c54718OEv.A03) {
                C9JS c9js2 = c54718OEv.A01;
                if (c9js2 != null) {
                    Al8 al82 = c54718OEv.A00;
                    if (al82 != null) {
                        C121275eQ A03 = AbstractC50633MWu.A03(c54718OEv.A04, c54718OEv.A05, new OUQ(c9js2.A0A, "ClipsPendingMediaAssetDownloader", true, false, false));
                        A03.A00 = new EZ5(0, al82, c54718OEv);
                        C1GJ.A03(A03);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            return;
        }
        interfaceC37150GYl.DY3();
    }
}
