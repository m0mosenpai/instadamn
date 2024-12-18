package X;

import android.content.Context;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes12.dex */
public final class Y9I implements InterfaceC40591uS {
    public ByteArrayOutputStream A00;
    public boolean A01;
    public HandlerC72130XPc A02;
    public final C88753xb A03;
    public final C39911tF A04;
    public final InterfaceC38001pk A05;
    public final InterfaceC38631qu A06;
    public final SamplingPolicyConfig A07;
    public final long A08;
    public final Context A09;
    public final InterfaceC37781pG A0A;
    public final C38951rU A0B;

    private HandlerC72130XPc A00() {
        HandlerC72130XPc handlerC72130XPc = this.A02;
        if (handlerC72130XPc == null) {
            HandlerC72130XPc handlerC72130XPc2 = new HandlerC72130XPc(this.A0A.ALb("Analytics-NormalPri-InMemory-Scheduler", 10).getLooper(), this);
            this.A02 = handlerC72130XPc2;
            return handlerC72130XPc2;
        }
        return handlerC72130XPc;
    }

    @Override // X.InterfaceC40591uS
    public final void Ct2() {
        if (this.A00 != null) {
            HandlerC72130XPc A00 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            A00.removeMessages(1, byteArrayOutputStream);
            AbstractC166997dE.A1H(A00, byteArrayOutputStream, 1);
            return;
        }
        throw AbstractC166987dD.A14("mByteArrayOutputStream is null");
    }

    @Override // X.InterfaceC40591uS
    public final void Ct7(long j) {
        if (this.A00 != null) {
            if (!this.A01) {
                this.A01 = true;
                HandlerC72130XPc A00 = A00();
                ByteArrayOutputStream byteArrayOutputStream = this.A00;
                A00.sendMessageDelayed(A00.obtainMessage(1, byteArrayOutputStream), this.A08);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("mByteArrayOutputStream is null");
    }

    @Override // X.InterfaceC40591uS
    public final void Ct8(long[] jArr, int i, int i2) {
        if (this.A00 != null) {
            if (!this.A01) {
                this.A01 = true;
                HandlerC72130XPc A00 = A00();
                ByteArrayOutputStream byteArrayOutputStream = this.A00;
                A00.sendMessageDelayed(A00.obtainMessage(1, byteArrayOutputStream), this.A08);
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("mByteArrayOutputStream is null");
    }

    @Override // X.InterfaceC40591uS
    public final void CtY(String str) {
        if (this.A00 != null) {
            HandlerC72130XPc A00 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            A00.removeMessages(1, byteArrayOutputStream);
            AbstractC166997dE.A1H(A00, byteArrayOutputStream, 1);
        }
    }

    @Override // X.InterfaceC40591uS
    public final /* bridge */ /* synthetic */ void EWx(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) obj;
        if (this.A00 != byteArrayOutputStream) {
            this.A00 = byteArrayOutputStream;
            this.A01 = false;
        }
    }

    @Override // X.InterfaceC40591uS
    public final void F8b() {
        if (this.A00 != null) {
            HandlerC72130XPc A00 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            A00.removeMessages(1, byteArrayOutputStream);
            AbstractC166997dE.A1H(A00, byteArrayOutputStream, 1);
        }
    }

    public Y9I(Context context, C39911tF c39911tF, C04060Jx c04060Jx, C38951rU c38951rU, long j) {
        this.A09 = context;
        this.A04 = c39911tF;
        this.A08 = j;
        this.A0B = c38951rU;
        try {
            C39251s2 A00 = C39251s2.A00(context);
            this.A05 = (InterfaceC38001pk) C39251s2.A01(A00, c39911tF.A02.getName(), A00.A05);
            Class cls = c39911tF.A01;
            InterfaceC38631qu interfaceC38631qu = null;
            C39251s2 A002 = C39251s2.A00(context);
            SamplingPolicyConfig samplingPolicyConfig = (SamplingPolicyConfig) C39251s2.A02(A002, cls.getName(), A002.A03);
            this.A07 = samplingPolicyConfig;
            Class cls2 = c39911tF.A00;
            if (cls2 != null) {
                C39251s2 A003 = C39251s2.A00(context);
                interfaceC38631qu = (InterfaceC38631qu) C39251s2.A02(A003, cls2.getName(), A003.A02);
            }
            this.A06 = interfaceC38631qu;
            this.A0A = C39251s2.A00(context).A04(c39911tF.A03.getName());
            this.A03 = new C88753xb(context, c04060Jx, samplingPolicyConfig, c39911tF.A05);
        } catch (IllegalAccessException e) {
            throw AbstractC72049XLp.A09(this.A04, e);
        } catch (InstantiationException e2) {
            throw AbstractC72049XLp.A09(this.A04, e2);
        } catch (NoSuchMethodException e3) {
            throw AbstractC72049XLp.A09(this.A04, e3);
        } catch (InvocationTargetException e4) {
            throw AbstractC72049XLp.A09(this.A04, e4);
        }
    }

    @Override // X.InterfaceC40591uS
    public final void Ct6() {
        throw C00O.createAndThrow();
    }
}
