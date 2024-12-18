package X;

import android.media.AudioManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.1vG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41081vG extends C41101vI implements AudioManager.OnAudioFocusChangeListener, InterfaceC13000lm {
    public static C41081vG A03;
    public AudioManager.OnAudioFocusChangeListener A00;
    public final C41171vR A01;
    public final UserSession A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0lZ, X.1vR] */
    public C41081vG(AudioManager audioManager, UserSession userSession) {
        super(audioManager, userSession);
        C14360o3.A0B(userSession, 2);
        this.A02 = userSession;
        ?? r3 = new InterfaceC12870lZ() { // from class: X.1vR
            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                int A032 = C0f9.A03(521533402);
                C41081vG c41081vG = C41081vG.this;
                C41081vG.A00(c41081vG, c41081vG, true);
                C0f9.A0A(358982900, A032);
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                C0f9.A0A(674310865, C0f9.A03(739061934));
            }
        };
        this.A01 = r3;
        if (C18U.A06(C06090Tz.A05, userSession, 36319712333864541L)) {
            C218914p.A04(EnumC220415e.A02, r3, false, false);
        } else {
            C218914p.A03(EnumC220415e.A03, r3);
        }
    }

    @Override // X.C41101vI
    public final void A03(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        A00(onAudioFocusChangeListener, this, false);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (i == -1) {
            A00(this, this, true);
            return;
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A00;
        if (onAudioFocusChangeListener == null) {
            return;
        }
        onAudioFocusChangeListener.onAudioFocusChange(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r0.booleanValue() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.media.AudioManager.OnAudioFocusChangeListener r1, X.C41081vG r2, boolean r3) {
        /*
            android.media.AudioManager$OnAudioFocusChangeListener r0 = r2.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto Lb
            if (r3 != 0) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A00
            boolean r0 = r0.get()
            if (r0 == 0) goto L20
            if (r3 == 0) goto L24
            android.media.AudioManager$OnAudioFocusChangeListener r1 = r2.A00
            if (r1 == 0) goto L1d
            r0 = -1
            r1.onAudioFocusChange(r0)
        L1d:
            r2.A01(r2)
        L20:
            r0 = 0
            r2.A00 = r0
            return
        L24:
            com.instagram.common.session.UserSession r0 = r2.A02
            X.1Hd r0 = X.AbstractC24321Hb.A00(r0)
            java.lang.Boolean r0 = r0.A01
            if (r0 == 0) goto L1d
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L20
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41081vG.A00(android.media.AudioManager$OnAudioFocusChangeListener, X.1vG, boolean):void");
    }

    @Override // X.C41101vI
    public final void A04(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        if (!onAudioFocusChangeListener.equals(this.A00)) {
            if (super.A00.get()) {
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = this.A00;
                if (onAudioFocusChangeListener2 != null) {
                    onAudioFocusChangeListener2.onAudioFocusChange(-2);
                }
                this.A00 = onAudioFocusChangeListener;
                onAudioFocusChangeListener.onAudioFocusChange(4);
                return;
            }
            this.A00 = onAudioFocusChangeListener;
            A02(this);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this.A01);
    }
}
