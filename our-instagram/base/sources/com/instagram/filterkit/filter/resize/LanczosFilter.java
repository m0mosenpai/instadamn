package com.instagram.filterkit.filter.resize;

import X.AbstractC12960li;
import X.AbstractC19730y1;
import X.AnonymousClass001;
import X.C0w9;
import X.C14360o3;
import X.C209089Mq;
import X.C72240XZt;
import X.C72783Xn3;
import X.C72832XoQ;
import X.C9N1;
import X.C9N2;
import X.InterfaceC19610xo;
import X.LNL;
import X.MSV;
import X.XO3;
import X.XOM;
import X.YPq;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.util.creation.ShaderBridge;

/* loaded from: classes12.dex */
public class LanczosFilter extends BaseFilter {
    public C72832XoQ A00;
    public C72832XoQ A01;
    public XO3 A02;
    public XO3 A03;
    public XOM A04;
    public XOM A05;
    public XOM A06;
    public XOM A07;
    public XOM A08;
    public XOM A09;
    public C72240XZt A0A;
    public C72240XZt A0B;
    public C72783Xn3 A0C;
    public final boolean A0D;
    public static final Parcelable.Creator CREATOR = new LNL(78);
    public static final C9N2 A0E = C9N1.A00();

    public static int A00(String str, String str2) {
        int compileProgram = ShaderBridge.compileProgram(str, false, false, true, false, false, false);
        if (compileProgram == 0) {
            C0w9.A03(AnonymousClass001.A0g("LanczosFilter", "_compile_", str), "");
            InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
            ARD.E77(MSV.A00(1419), false);
            ARD.apply();
            compileProgram = ShaderBridge.compileProgram(str2, false, false, true, false, false, false);
            if (compileProgram == 0) {
                C0w9.A03(AnonymousClass001.A0g("LanczosFilter", "_compile_", str2), "");
                String A0R = AnonymousClass001.A0R("Error compiling shader ", str2);
                C14360o3.A0B(A0R, 1);
                throw new Exception(A0R);
            }
        }
        return compileProgram;
    }

    @Override // X.BCA
    public final void AHR(YPq yPq) {
        XO3 xo3 = this.A02;
        if (xo3 != null) {
            int i = xo3.A00;
            BitmapFactory.Options options = C209089Mq.A00;
            GLES20.glDeleteProgram(i);
            this.A02 = null;
        }
        XO3 xo32 = this.A03;
        if (xo32 != null) {
            int i2 = xo32.A00;
            BitmapFactory.Options options2 = C209089Mq.A00;
            GLES20.glDeleteProgram(i2);
            this.A03 = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xn3, java.lang.Object] */
    public LanczosFilter(Parcel parcel) {
        this.A0C = new Object();
        this.A0D = parcel.readInt() == 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xn3, java.lang.Object] */
    public LanczosFilter() {
        this.A0C = new Object();
        this.A0D = false;
    }
}
