package X;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.time.AwakeTimeSinceBootClock;

/* loaded from: classes8.dex */
public abstract class JQS extends AbstractC69603Au {
    public boolean A00;
    public boolean A01;
    public final MessageQueue.IdleHandler A02;
    public final JQR A03;

    public void A0N(Context context, C55782hJ c55782hJ, InterfaceC11380iw interfaceC11380iw, InterfaceC59992oh interfaceC59992oh) {
        A0O(context, c55782hJ, interfaceC11380iw, interfaceC59992oh, false);
    }

    public void A0Q(Context context, C55782hJ c55782hJ, InterfaceC59992oh interfaceC59992oh) {
        A0O(context, c55782hJ, null, interfaceC59992oh, false);
    }

    public boolean A0R() {
        return true;
    }

    @Override // X.AbstractC69603Au
    public final void A03() {
        if (this.A01) {
            super.A03();
        }
    }

    public void A0L() {
        if (super.A01 && !this.A01) {
            this.A01 = true;
            C006802i c006802i = this.A05;
            int A01 = A01();
            c006802i.markerPoint(A01, super.A00, "initialize_end");
            if (!A0R()) {
                c006802i.markerDrop(A01, super.A00);
            } else {
                if (!this.A08.isEmpty()) {
                    return;
                }
                A0A(AwakeTimeSinceBootClock.INSTANCE.now(), (short) 2);
            }
        }
    }

    public final void A0M() {
        if (super.A01) {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: X.6OR
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    JQS.this.A0L();
                    return false;
                }
            });
        }
    }

    public void A0O(Context context, C55782hJ c55782hJ, InterfaceC11380iw interfaceC11380iw, InterfaceC59992oh interfaceC59992oh, boolean z) {
        this.A00 = z;
        boolean z2 = interfaceC59992oh instanceof InterfaceC11380iw;
        if (z2) {
            C1KM.A04((InterfaceC11380iw) interfaceC59992oh);
        }
        interfaceC59992oh.registerLifecycleListener(this.A03);
        A0P(context, c55782hJ, interfaceC11380iw, true);
        if (z2) {
            this.A05.markerAnnotate(A01(), super.A00, "container_module", ((InterfaceC11380iw) interfaceC59992oh).getModuleName());
        }
    }

    public void A0P(Context context, C55782hJ c55782hJ, InterfaceC11380iw interfaceC11380iw, boolean z) {
        String str;
        C140976Yz c140976Yz = c55782hJ.A01;
        if (c140976Yz == null) {
            c140976Yz = new C140976Yz(null, "unknown", AwakeTimeSinceBootClock.INSTANCE.now());
        }
        String str2 = c140976Yz.A03;
        int A01 = A01();
        A0B(context);
        A09(c140976Yz.A01);
        C006802i c006802i = this.A05;
        c006802i.markerPoint(A01, super.A00, "initialize_start");
        int i = super.A00;
        if (interfaceC11380iw != null) {
            c006802i.markerAnnotate(A01, i, "source_module", interfaceC11380iw.getModuleName());
        } else {
            c006802i.markerAnnotate(A01, i, "source_module", str2);
        }
        c006802i.markerAnnotate(A01, super.A00, "background_state", C218914p.A01());
        int i2 = super.A00;
        String str3 = c140976Yz.A02;
        if (str3 == null) {
            str3 = "button";
        }
        c006802i.markerAnnotate(A01, i2, "click_point", str3);
        int i3 = super.A00;
        if (z) {
            str = "cold";
        } else {
            str = "warm";
        }
        c006802i.markerAnnotate(A01, i3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        c006802i.markerAnnotate(A01, super.A00, "APP_STARTUP_TYPE", C1CC.A09.toString());
        c006802i.markerAnnotate(A01, super.A00, "APP_STARTUP_TIME_BUCKET", C1CC.A00());
        int i4 = super.A00;
        long j = -1;
        if (C1CC.A00 != -1) {
            j = System.currentTimeMillis() - C1CC.A00;
        }
        c006802i.markerAnnotate(A01, i4, "time_since_upgrade_ms", j);
        c006802i.markerAnnotate(A01, super.A00, "foreground_cold_start_count_since_upgrade", C1CC.A05);
        c006802i.markerAnnotate(A01, super.A00, "all_cold_start_count_since_upgrade", C1CC.A04);
        c006802i.markerAnnotate(A01, super.A00, "foreground_timespent_since_upgrade_ms", C1CC.A06);
        C2ZI.A00.A06(A01, "click_point", str3);
    }

    public JQS(AbstractC12990ll abstractC12990ll) {
        super(abstractC12990ll);
        this.A03 = new JQR(this);
        this.A02 = new MessageQueue.IdleHandler() { // from class: X.JQT
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                JQS.this.A06();
                return false;
            }
        };
    }
}
