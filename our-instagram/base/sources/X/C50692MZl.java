package X;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.location.Location;
import android.os.Build;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.PhotoSession;
import com.instagram.location.intf.LocationSignalPackage;
import java.io.File;

/* renamed from: X.MZl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50692MZl implements InterfaceC127465pP, InterfaceC57959Pn5 {
    public Location A00;
    public LocationSignalPackage A01;
    public final Activity A02;
    public final UserSession A03;
    public final AnonymousClass840 A04;
    public final C44265JhC A05;

    public C50692MZl(Activity activity, UserSession userSession, C44265JhC c44265JhC, AnonymousClass840 anonymousClass840) {
        AbstractC25233BEq.A0w(1, anonymousClass840, userSession, c44265JhC);
        this.A04 = anonymousClass840;
        this.A02 = activity;
        this.A03 = userSession;
        this.A05 = c44265JhC;
    }

    public final void A00(Context context, C196748n4 c196748n4, byte[] bArr) {
        Location location;
        CropInfo cropInfo;
        C14360o3.A0B(bArr, 1);
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = true;
        options.inJustDecodeBounds = true;
        C0fL.A00(bArr, 0, bArr.length, options);
        long currentTimeMillis = System.currentTimeMillis();
        String A00 = AbstractC196848nE.A00(currentTimeMillis);
        C14360o3.A07(A00);
        UserSession userSession = this.A03;
        String A03 = C50472Tr.A03(userSession, A00);
        String A02 = C50472Tr.A02(context, AbstractC23021Ah.A00(userSession).A1x());
        Location location2 = this.A00;
        if (location2 == null) {
            location = null;
        } else {
            location = new Location(location2);
        }
        int A002 = AbstractC196718n1.A00(bArr);
        File A04 = C197098ne.A04(null, userSession, A02, A03, bArr);
        if (location != null) {
            AbstractC209859Pw.A03(location, A04.getAbsolutePath());
        }
        if (AbstractC23021Ah.A00(userSession).A1x() && AbstractC23451Ch.A07(context, "android.permission.WRITE_EXTERNAL_STORAGE") && Build.VERSION.SDK_INT <= 29) {
            ContentResolver contentResolver = context.getContentResolver();
            C14360o3.A07(contentResolver);
            C14360o3.A0B(A03, 5);
            String A0T = AnonymousClass001.A0T(A02, A03, '/');
            ContentValues contentValues = new ContentValues(7);
            contentValues.put(DialogModule.KEY_TITLE, A00);
            contentValues.put("_display_name", A03);
            contentValues.put("datetaken", Long.valueOf(currentTimeMillis));
            contentValues.put("mime_type", "image/jpeg");
            contentValues.put("orientation", Integer.valueOf(A002));
            contentValues.put("_data", A0T);
            if (location != null && !C18U.A06(C06090Tz.A05, userSession, 36323951466524380L)) {
                contentValues.put(com.facebook.location.platform.api.Location.LATITUDE, Double.valueOf(location.getLatitude()));
                contentValues.put("longitude", Double.valueOf(location.getLongitude()));
            }
            contentResolver.insert(C197098ne.A00, contentValues);
        }
        String path = android.net.Uri.fromFile(A04).getPath();
        if (path != null) {
            Number number = (Number) c196748n4.A03(C196748n4.A0K);
            if (number == null || 1 != number.intValue()) {
                z = false;
            }
            Rect A022 = c196748n4.A02(A002);
            AnonymousClass840 anonymousClass840 = this.A04;
            AnonymousClass841 A003 = anonymousClass840.A00();
            A003.Enb(path, null);
            A003.ESV(A022, options.outWidth, options.outHeight);
            CreationSession creationSession = ((MX5) A003).A01;
            if (creationSession.A02() != null) {
                creationSession.A02().A0C = z;
            }
            float f = this.A05.A01;
            if (creationSession.A02() != null) {
                creationSession.A02().A00 = f;
            }
            creationSession.A08 = this.A01;
            C50713MaC.A00(userSession).A01(context, null, bArr);
            C55105ObK A004 = C50713MaC.A00(userSession);
            PhotoSession A023 = creationSession.A02();
            if (A023 != null && (cropInfo = A023.A05) != null) {
                A004.A02(context, cropInfo, A002, z);
                AnonymousClass841 A005 = anonymousClass840.A00();
                Activity activity = this.A02;
                C14360o3.A0A(activity);
                AbstractC53891NsN.A00(activity, userSession, A005);
                C11T.A02(new PTX(context, c196748n4, this, path, A002));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC127465pP
    public final void DEF(Exception exc) {
    }

    @Override // X.InterfaceC127465pP
    public final void onLocationChanged(Location location) {
        C14360o3.A0B(location, 0);
        this.A00 = location;
        C1VW c1vw = C1VW.A00;
        if (c1vw != null) {
            c1vw.removeLocationUpdates(this.A03, this);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC57959Pn5
    public final void DQG(LocationSignalPackage locationSignalPackage) {
        this.A01 = locationSignalPackage;
        this.A00 = locationSignalPackage.BOK();
    }
}
