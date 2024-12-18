package X;

import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.user.model.UpcomingEventImpl;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class OOw {
    /* JADX WARN: Type inference failed for: r8v2, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public static final C51754Mtd A00(C128175qm c128175qm) {
        EnumC189548aZ enumC189548aZ;
        Venue venue;
        String str = c128175qm.A0T;
        String str2 = c128175qm.A0V;
        MediaCroppingCoordinates mediaCroppingCoordinates = c128175qm.A06;
        C9JS c9js = c128175qm.A0E;
        String str3 = null;
        if (c9js != null) {
            enumC189548aZ = c9js.A06;
        } else {
            enumC189548aZ = null;
        }
        JWd jWd = new JWd(mediaCroppingCoordinates, str2, 6, AbstractC25229BEm.A1a(enumC189548aZ, EnumC189548aZ.A06));
        String str4 = c128175qm.A0S;
        if (str4 == null) {
            str4 = "";
        }
        C101394gx c101394gx = c128175qm.A0O;
        List list = c128175qm.A0q;
        List list2 = c128175qm.A0n;
        boolean z = c128175qm.A17;
        LocationDict locationDict = c128175qm.A0L;
        if (locationDict != null) {
            ?? obj = new Object();
            obj.A00 = locationDict;
            venue = obj;
        } else {
            venue = null;
        }
        EnumC76383bi enumC76383bi = c128175qm.A0K;
        C38686GzR c38686GzR = c128175qm.A04;
        C50627MWo c50627MWo = new C50627MWo(44, c128175qm.A0D, (Object) null);
        AudioOverlayTrack audioOverlayTrack = c128175qm.A0N;
        String str5 = c128175qm.A0g;
        List list3 = c128175qm.A0t;
        String str6 = c128175qm.A0X;
        C51757Mtg c51757Mtg = new C51757Mtg(c128175qm.A0J, c128175qm.A0R, c128175qm.A0Y, 12);
        String str7 = c128175qm.A0f;
        UpcomingEventImpl upcomingEventImpl = c128175qm.A0Q;
        boolean z2 = c128175qm.A18;
        String str8 = c128175qm.A0d;
        C51685MsG c51685MsG = c128175qm.A0I;
        E72 e72 = c128175qm.A03;
        C51756Mtf c51756Mtf = c128175qm.A02;
        C38709H2v c38709H2v = c128175qm.A05;
        boolean z3 = c128175qm.A0y;
        boolean z4 = c128175qm.A0x;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = c128175qm.A07;
        C9C9 c9c9 = new C9C9(c128175qm.A0a, c128175qm.A0Z, 10);
        List list4 = c128175qm.A0m;
        boolean z5 = c128175qm.A19;
        C110204xp c110204xp = c128175qm.A08;
        if (c110204xp != null) {
            str3 = Long.valueOf(c110204xp.A00).toString();
        }
        return new C51754Mtd(c9c9, c51756Mtf, e72, c50627MWo, new C51740MtP(str3, 6, z5), jWd, c51757Mtg, c38686GzR, c38709H2v, mediaGenAIDetectionMethod, c51685MsG, null, enumC76383bi, null, venue, audioOverlayTrack, null, c101394gx, upcomingEventImpl, str, str4, null, str5, str6, str7, str8, null, null, list, list2, null, list3, null, list4, null, 0, z, false, z2, z3, false, z4, c128175qm.A14, c128175qm.A16, c128175qm.A11, c128175qm.A13, c128175qm.A0w, false, c128175qm.A10, c128175qm.A1A);
    }

    public static final boolean A01(C51754Mtd c51754Mtd) {
        C38709H2v c38709H2v;
        if (c51754Mtd != null && (c38709H2v = c51754Mtd.A08) != null && c38709H2v.A00 != null) {
            return true;
        }
        return false;
    }
}
