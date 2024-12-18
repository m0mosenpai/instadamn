package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.Map;

/* renamed from: X.DRg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30176DRg extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30176DRg(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A01 = i;
        this.A03 = interfaceC16620sF;
        if (7 - i2 != 0) {
            this.A02 = interfaceC74953Yl;
            this.A04 = interfaceC74953Yl2;
        } else {
            this.A04 = interfaceC74953Yl;
            this.A02 = interfaceC74953Yl2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5AW c5aw;
        C127055oj c127055oj;
        C59W c59w;
        C114205Dh c114205Dh;
        float f;
        float f2;
        int round;
        int i;
        C127055oj c127055oj2;
        C114205Dh c114205Dh2;
        InterfaceC137886Mn interfaceC137886Mn;
        boolean A00;
        int i2;
        InterfaceC16620sF interfaceC16620sF;
        Object value;
        InterfaceC74953Yl interfaceC74953Yl;
        switch (this.A00) {
            case 0:
                c5aw = (C5AW) obj;
                InterfaceC1131259a interfaceC1131259a = (InterfaceC1131259a) this.A03;
                C28816Cnm c28816Cnm = (C28816Cnm) this.A04;
                int i3 = c28816Cnm.A00;
                CVF cvf = c28816Cnm.A02;
                C28262Cd7 c28262Cd7 = (C28262Cd7) c28816Cnm.A03.invoke();
                if (c28262Cd7 != null) {
                    c127055oj = c28262Cd7.A02;
                } else {
                    c127055oj = null;
                }
                boolean A1X = AbstractC167007dF.A1X(interfaceC1131259a.getLayoutDirection(), AnonymousClass583.Rtl);
                c59w = (C59W) this.A02;
                int i4 = c59w.A01;
                if (c127055oj != null) {
                    c114205Dh = c127055oj.A06(cvf.A01.E36(i3));
                } else {
                    c114205Dh = C114205Dh.A04;
                }
                C5Y6 c5y6 = AbstractC27743CLk.A00;
                int EL8 = interfaceC1131259a.EL8(2.0f);
                if (A1X) {
                    f2 = i4 - c114205Dh.A01;
                    f = f2 - EL8;
                } else {
                    f = c114205Dh.A01;
                    f2 = f + EL8;
                }
                C114205Dh c114205Dh3 = new C114205Dh(f, c114205Dh.A03, f2, c114205Dh.A00);
                C28364CfO c28364CfO = c28816Cnm.A01;
                c28364CfO.A00(C6M3.Horizontal, c114205Dh3, this.A01, c59w.A01);
                round = Math.round(-c28364CfO.A03.B72());
                i = 0;
                c5aw.A07(c59w, round, i);
                return C0eB.A00;
            case 1:
                c5aw = (C5AW) obj;
                InterfaceC1128957x interfaceC1128957x = (InterfaceC1128957x) this.A03;
                C28817Cnn c28817Cnn = (C28817Cnn) this.A04;
                int i5 = c28817Cnn.A00;
                CVF cvf2 = c28817Cnn.A02;
                C28262Cd7 c28262Cd72 = (C28262Cd7) c28817Cnn.A03.invoke();
                if (c28262Cd72 != null) {
                    c127055oj2 = c28262Cd72.A02;
                } else {
                    c127055oj2 = null;
                }
                c59w = (C59W) this.A02;
                round = 0;
                if (c127055oj2 != null) {
                    c114205Dh2 = c127055oj2.A06(cvf2.A01.E36(i5));
                } else {
                    c114205Dh2 = C114205Dh.A04;
                }
                C5Y6 c5y62 = AbstractC27743CLk.A00;
                int EL82 = interfaceC1128957x.EL8(2.0f);
                float f3 = c114205Dh2.A01;
                C114205Dh c114205Dh4 = new C114205Dh(f3, c114205Dh2.A03, f3 + EL82, c114205Dh2.A00);
                C28364CfO c28364CfO2 = c28817Cnn.A01;
                c28364CfO2.A00(C6M3.Vertical, c114205Dh4, this.A01, c59w.A00);
                i = Math.round(-c28364CfO2.A03.B72());
                c5aw.A07(c59w, round, i);
                return C0eB.A00;
            case 2:
                interfaceC137886Mn = (InterfaceC137886Mn) obj;
                A00 = AbstractC28430Cgd.A00((C58Z) this.A04, (C58Z) this.A02, (InterfaceC16660sJ) this.A03, this.A01);
                Boolean valueOf = Boolean.valueOf(A00);
                if (A00 && interfaceC137886Mn.BC7()) {
                    return null;
                }
            case 3:
                interfaceC137886Mn = (InterfaceC137886Mn) obj;
                A00 = AbstractC25331BJa.A04((C58Z) this.A04, (C114205Dh) this.A02, (InterfaceC16660sJ) this.A03, this.A01);
                Boolean valueOf2 = Boolean.valueOf(A00);
                return A00 ? valueOf2 : valueOf2;
            case 4:
                C5AW c5aw2 = (C5AW) obj;
                C14360o3.A0B(c5aw2, 0);
                C59W c59w2 = (C59W) this.A02;
                if (c59w2 != null) {
                    c5aw2.A07(c59w2, 0, 0);
                    i2 = c59w2.A00;
                } else {
                    i2 = 0;
                }
                C59W c59w3 = (C59W) this.A03;
                if (c59w3 != null) {
                    c5aw2.A07(c59w3, 0, i2);
                }
                int i6 = i2 + this.A01;
                C59W c59w4 = (C59W) this.A04;
                if (c59w4 != null) {
                    c5aw2.A07(c59w4, 0, i6);
                }
                return C0eB.A00;
            case 5:
                String str = (String) obj;
                C14360o3.A0B(str, 0);
                return new C133115zd((Context) this.A02, (UserSession) this.A04, (C6RN) this.A03, false, null, null, str, null, null, this.A01, false, false, false);
            case 6:
                C6Nu A0T = AbstractC25228BEl.A0T(obj);
                List list = (List) this.A04;
                DNQ dnq = DNQ.A00;
                Modifier modifier = (Modifier) this.A02;
                int i7 = this.A01;
                AbstractC25227BEk.A15(A0T, new C30722DfK(modifier, list, (InterfaceC16660sJ) this.A03, i7), new C30183DRo(36, list, (InterfaceC16660sJ) dnq), new C30183DRo(37, list, (InterfaceC16660sJ) DNR.A00), list.size());
                return C0eB.A00;
            case 7:
                String A0Q = AbstractC167027dH.A0Q(obj);
                InterfaceC74953Yl interfaceC74953Yl2 = (InterfaceC74953Yl) this.A04;
                interfaceC74953Yl2.Egh(C00Q.A03(A0Q, this.A01));
                interfaceC16620sF = (InterfaceC16620sF) this.A03;
                value = interfaceC74953Yl2.getValue();
                interfaceC74953Yl = (InterfaceC74953Yl) this.A02;
                interfaceC16620sF.invoke(value, interfaceC74953Yl.getValue());
                return C0eB.A00;
            case 8:
                String A0Q2 = AbstractC167027dH.A0Q(obj);
                interfaceC74953Yl = (InterfaceC74953Yl) this.A02;
                interfaceC74953Yl.Egh(C00Q.A03(A0Q2, this.A01));
                interfaceC16620sF = (InterfaceC16620sF) this.A03;
                value = AbstractC25226BEj.A1A(this.A04);
                interfaceC16620sF.invoke(value, interfaceC74953Yl.getValue());
                return C0eB.A00;
            case 9:
                C81473kH c81473kH = (C81473kH) obj;
                C14360o3.A0B(c81473kH, 0);
                return new C42614ItX(AbstractC166997dE.A0L(c81473kH.A01), ((CSF) this.A04).A01.AmO(), c81473kH, (C38321qM) this.A02, (C75113Zb) this.A03, this.A01);
            case 10:
                ((InterfaceC16610sE) ((C38612GyF) this.A03).A01.A00).invoke(this.A02, Integer.valueOf(this.A01), ((C41197ILl) this.A04).A00);
                return C0eB.A00;
            case 11:
                C41157IJw c41157IJw = (C41157IJw) obj;
                C14360o3.A0B(c41157IJw, 0);
                ((CP8) this.A04).A00.BQv().Dmi((C38321qM) this.A02, null, c41157IJw, (C75113Zb) this.A03, this.A01);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(obj, 0);
                ((InterfaceC16600sD) this.A03).invoke(this.A04, obj, Integer.valueOf(this.A01), this.A02);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(obj, 0);
                ((InterfaceC16600sD) this.A03).invoke(obj, this.A04, Integer.valueOf(this.A01), this.A02);
                return C0eB.A00;
            case 14:
                Bitmap bitmap = (Bitmap) obj;
                C14360o3.A0B(bitmap, 0);
                SparseArray sparseArray = (SparseArray) this.A02;
                int i8 = this.A01;
                Bitmap A0F = AbstractC167007dF.A0F(bitmap.getWidth(), bitmap.getHeight());
                Paint A0Q3 = AbstractC166997dE.A0Q();
                Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                Canvas canvas = new Canvas(A0F);
                A0Q3.setAntiAlias(true);
                canvas.drawARGB(0, 0, 0, 0);
                canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, A0Q3);
                AbstractC166997dE.A1D(A0Q3, PorterDuff.Mode.SRC_IN);
                canvas.drawBitmap(bitmap, rect, rect, A0Q3);
                sparseArray.put(i8, A0F);
                if (sparseArray.size() == ((C15100pQ) this.A03).A00) {
                    AbstractC25225BEi.A1U(this.A04, sparseArray);
                }
                return C0eB.A00;
            default:
                View view = (View) obj;
                C14360o3.A0B(view, 0);
                C27847CPk c27847CPk = (C27847CPk) this.A02;
                C99134ca c99134ca = (C99134ca) this.A04;
                int i9 = this.A01;
                C14360o3.A0B(c99134ca, 0);
                Map map = AbstractC27803CNs.A00;
                String str2 = c99134ca.A05;
                Object obj2 = map.get(str2);
                if (obj2 == null) {
                    obj2 = new IJ0(c99134ca, i9);
                    map.put(str2, obj2);
                }
                IJ0 ij0 = (IJ0) obj2;
                ProductFeedItem productFeedItem = (ProductFeedItem) this.A03;
                C14360o3.A0A(productFeedItem);
                AbstractC167017dG.A1R(ij0, productFeedItem);
                InterfaceC09390do interfaceC09390do = c27847CPk.A00.A0N;
                ((C64892wn) interfaceC09390do.getValue()).A02(productFeedItem, ij0, "");
                ((C64892wn) interfaceC09390do.getValue()).A00(view, productFeedItem, ij0.A02.Byk());
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30176DRg(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(1);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
        this.A04 = obj3;
    }
}
