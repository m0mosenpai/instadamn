package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import java.util.Collections;
import java.util.List;

/* renamed from: X.AdJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23624AdJ implements InterfaceC193488hT {
    public final /* synthetic */ C193838i4 A00;
    public final /* synthetic */ List A01;

    @Override // X.InterfaceC193488hT
    public final boolean CXZ(Medium medium) {
        return true;
    }

    @Override // X.InterfaceC193488hT
    public final void Dt1(Bitmap bitmap, Medium medium, boolean z) {
        AbstractC167007dF.A1D(medium, 0, bitmap);
        C193838i4 c193838i4 = this.A00;
        C193838i4.A07(bitmap, c193838i4, medium.A07);
        C8YY c8yy = c193838i4.A0w;
        List unmodifiableList = Collections.unmodifiableList(this.A01);
        C14360o3.A07(unmodifiableList);
        c8yy.A0J(c193838i4, unmodifiableList, 0, false, false, false);
    }

    public C23624AdJ(C193838i4 c193838i4, List list) {
        this.A00 = c193838i4;
        this.A01 = list;
    }

    @Override // X.InterfaceC193488hT
    public final void DN1(Medium medium, String str) {
        C193838i4 c193838i4 = this.A00;
        C8YY c8yy = c193838i4.A0w;
        List unmodifiableList = Collections.unmodifiableList(this.A01);
        C14360o3.A07(unmodifiableList);
        c8yy.A0J(c193838i4, unmodifiableList, 0, false, false, false);
    }
}
