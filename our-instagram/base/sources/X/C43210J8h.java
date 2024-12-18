package X;

import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeNotifyToUsers;
import com.instagram.user.model.User;
import java.util.AbstractCollection;

/* renamed from: X.J8h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43210J8h extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43210J8h(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    public static final void A00(InterfaceC11380iw interfaceC11380iw, IgImageView igImageView, C38321qM c38321qM, C6XV c6xv, Integer num) {
        boolean z = false;
        c6xv.A07(new C28186CbZ(interfaceC11380iw, igImageView, c38321qM, num, "intro", 112, z, z));
    }

    public static void A01(C38321qM c38321qM, AbstractCollection abstractCollection) {
        User CDj;
        if (c38321qM != null && (CDj = c38321qM.A0C.CDj()) != null) {
            abstractCollection.add(new SuperlativeNotifyToUsers(CDj));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x051b, code lost:
    
        if (r2 == com.instagram.api.schemas.SellerShoppableFeedType.A09) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01dd, code lost:
    
        if (r3 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d8, code lost:
    
        if (r3 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d3, code lost:
    
        if (r3 != null) goto L44;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02a3  */
    @Override // X.InterfaceC16820sZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 3254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43210J8h.invoke():java.lang.Object");
    }
}
