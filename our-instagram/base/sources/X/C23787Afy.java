package X;

import android.content.Intent;
import android.os.Parcel;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Afy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23787Afy implements InterfaceC58031PoH {
    public final /* synthetic */ C8YR A00;
    public final /* synthetic */ ArrayList A01;
    public final /* synthetic */ boolean A02;

    @Override // X.InterfaceC58031PoH
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public C23787Afy(C8YR c8yr, ArrayList arrayList, boolean z) {
        this.A00 = c8yr;
        this.A01 = arrayList;
        this.A02 = z;
    }

    @Override // X.InterfaceC58031PoH
    public final void Dlo(Intent intent, boolean z) {
        C183688Ct c183688Ct;
        ShareMediaLoggingInfo shareMediaLoggingInfo;
        C8YR c8yr = this.A00;
        if (z) {
            if (C18U.A06(C06090Tz.A05, c8yr.A06, 36316645728129604L)) {
                ArrayList arrayList = this.A01;
                Parcel obtain = Parcel.obtain();
                ((ShareMediaLoggingInfo) arrayList.get(0)).writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                shareMediaLoggingInfo = (ShareMediaLoggingInfo) ShareMediaLoggingInfo.CREATOR.createFromParcel(obtain);
                ArrayList A1E = AbstractC166987dD.A1E();
                A1E.add(shareMediaLoggingInfo.A0B);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    A1E.add(((ShareMediaLoggingInfo) it.next()).A0B);
                }
                MediaUploadMetadata A00 = C915947r.A00(A1E);
                C14360o3.A0B(A00, 0);
                shareMediaLoggingInfo.A0B = A00;
            } else {
                shareMediaLoggingInfo = (ShareMediaLoggingInfo) AbstractC166997dE.A0k(this.A01);
            }
            C8YR.A02(intent, shareMediaLoggingInfo, c8yr);
            c183688Ct = c8yr.A0E;
            c183688Ct.A0b();
        } else {
            c183688Ct = c8yr.A0E;
            c183688Ct.A0e();
        }
        ((C1809981b) c8yr.A0Y).A01.A04(new C8VM(intent, z));
        if (z) {
            AbstractC166987dD.A0t(c8yr.A06).A09();
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = c8yr.A07;
        touchInterceptorFrameLayout.setScaleX(1.0f);
        touchInterceptorFrameLayout.setScaleY(1.0f);
        C8X5.A00(c8yr.A0P);
        c183688Ct.D2U(true);
        c183688Ct.A0c();
        if (this.A02) {
            c8yr.A0B.A0c.A0C(true, false);
        }
        C82D c82d = c8yr.A0M;
        c82d.A00.A0d.A1r.A04(intent.getBooleanExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHARE_TO_FB", false));
    }
}
