package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.AhA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23858AhA implements InterfaceC25185BCi {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C1GL A02;
    public final /* synthetic */ AbstractC24481Hr A03;
    public final /* synthetic */ C22925A8v A04;
    public final /* synthetic */ FilterGroupModel A05;
    public final /* synthetic */ C47Z A06;
    public final /* synthetic */ C183978Ee A07;
    public final /* synthetic */ Runnable A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public C23858AhA(Context context, UserSession userSession, C1GL c1gl, AbstractC24481Hr abstractC24481Hr, C22925A8v c22925A8v, FilterGroupModel filterGroupModel, C47Z c47z, C183978Ee c183978Ee, Runnable runnable, boolean z, boolean z2) {
        this.A01 = userSession;
        this.A06 = c47z;
        this.A0A = z;
        this.A00 = context;
        this.A07 = c183978Ee;
        this.A05 = filterGroupModel;
        this.A04 = c22925A8v;
        this.A02 = c1gl;
        this.A09 = z2;
        this.A08 = runnable;
        this.A03 = abstractC24481Hr;
    }

    @Override // X.InterfaceC25185BCi
    public final void DXL() {
        C9O1.A07(this.A00, this.A01, this.A06, "template_overlay_failed_to_save");
    }

    @Override // X.InterfaceC25185BCi
    public final void DXM(String str) {
        Bitmap decodeFile;
        ShareType shareType = ShareType.A0Y;
        UserSession userSession = this.A01;
        C47Z A03 = C9O1.A03(userSession, shareType);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36327615073630946L) && (decodeFile = BitmapFactory.decodeFile(str, new BitmapFactory.Options())) != null) {
            int max = Math.max(1, decodeFile.getWidth() * decodeFile.getHeight());
            int i = 0;
            for (int i2 = 0; i2 < decodeFile.getWidth(); i2++) {
                for (int i3 = 0; i3 < decodeFile.getHeight(); i3++) {
                    if (Color.alpha(decodeFile.getPixel(i2, i3)) > C18U.A01(c06090Tz, userSession, 36609090050463580L)) {
                        i++;
                    }
                }
            }
            A03.A0I = AbstractC166987dD.A0A(i / max, 100.0f);
        }
        A03.A33 = str;
        C47Z c47z = this.A06;
        c47z.A0V(A03);
        if (this.A0A) {
            Context context = this.A00;
            C183978Ee c183978Ee = this.A07;
            FilterGroupModel filterGroupModel = this.A05;
            C9O1.A05(context, userSession, this.A02, this.A03, this.A04, filterGroupModel, c47z, c183978Ee, this.A08, this.A09);
            return;
        }
        this.A08.run();
    }
}
