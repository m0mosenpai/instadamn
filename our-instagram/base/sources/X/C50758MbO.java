package X;

import android.os.Bundle;
import android.telecom.CallAudioState;
import android.telecom.Connection;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.MbO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50758MbO extends Connection {
    public String A00;
    public final UserSession A01;
    public final C1W6 A02;

    public C50758MbO(UserSession userSession, C1W6 c1w6, String str) {
        C14360o3.A0B(c1w6, 3);
        this.A01 = userSession;
        this.A00 = str;
        this.A02 = c1w6;
    }

    @Override // android.telecom.Connection
    public final void onShowIncomingCallUi() {
        String str = this.A00;
        C1W6 c1w6 = this.A02;
        UserSession userSession = this.A01;
        AbstractC167017dG.A1N(userSession, str);
        C9BW A00 = C1W6.A00(c1w6, this, str);
        if (A00 != null) {
            C1W6.A02((Bundle) A00.A01, userSession, c1w6, str);
        }
    }

    @Override // android.telecom.Connection
    public final void onAnswer() {
        super.onAnswer();
        String str = this.A00;
        C1W6 c1w6 = this.A02;
        UserSession userSession = this.A01;
        AbstractC167017dG.A1N(userSession, str);
        C9BW A00 = C1W6.A00(c1w6, this, str);
        if (A00 != null) {
            List list = c1w6.A01;
            C14360o3.A06(list);
            ListIterator listIterator = AbstractC001800i.A0a(list).listIterator();
            while (listIterator.hasNext()) {
                ((C1WF) listIterator.next()).Cwp((Bundle) A00.A01, userSession, str);
            }
        }
    }

    @Override // android.telecom.Connection
    public final void onCallAudioStateChanged(CallAudioState callAudioState) {
        super.onCallAudioStateChanged(callAudioState);
        C1W6 c1w6 = this.A02;
        C14360o3.A0B(this.A00, 1);
        List list = c1w6.A00;
        C14360o3.A06(list);
        ListIterator listIterator = AbstractC001800i.A0a(list).listIterator();
        while (listIterator.hasNext()) {
            N08 n08 = (N08) listIterator.next();
            EnumC53278NhG A01 = n08.A01();
            if (A01 == EnumC53278NhG.A05) {
                ((OMu) n08).A05.A00(AnonymousClass001.A1D("Speakerphone finished turning on for video call | AudioManager: ", ((OMu) n08).A02.isSpeakerphoneOn()), new Object[0]);
            }
            if (n08.aomCurrentAudioOutput != A01) {
                ((OMu) n08).A05.A00("onCallAudioStateChanged update audio output from %s to %s", n08.aomCurrentAudioOutput, A01);
                C14360o3.A0B(A01, 0);
                n08.aomCurrentAudioOutput = A01;
                n08.A05();
            }
            n08.A0C();
        }
    }

    @Override // android.telecom.Connection
    public final void onDisconnect() {
        super.onDisconnect();
        String str = this.A00;
        C1W6 c1w6 = this.A02;
        UserSession userSession = this.A01;
        AbstractC167017dG.A1N(userSession, str);
        C9BW A00 = C1W6.A00(c1w6, this, str);
        if (A00 != null) {
            List list = c1w6.A01;
            C14360o3.A06(list);
            ListIterator listIterator = AbstractC001800i.A0a(list).listIterator();
            while (listIterator.hasNext()) {
                ((C1WF) listIterator.next()).DAZ((Bundle) A00.A01, userSession, str);
            }
        }
    }

    @Override // android.telecom.Connection
    public final void onHold() {
        super.onHold();
    }

    @Override // android.telecom.Connection
    public final void onReject() {
        super.onReject();
        String str = this.A00;
        C1W6 c1w6 = this.A02;
        UserSession userSession = this.A01;
        AbstractC167017dG.A1N(userSession, str);
        C9BW A00 = C1W6.A00(c1w6, this, str);
        if (A00 != null) {
            List list = c1w6.A01;
            C14360o3.A06(list);
            ListIterator listIterator = AbstractC001800i.A0a(list).listIterator();
            while (listIterator.hasNext()) {
                ((C1WF) listIterator.next()).DeU((Bundle) A00.A01, userSession, str);
            }
        }
    }

    @Override // android.telecom.Connection
    public final void onUnhold() {
        super.onUnhold();
    }

    @Override // android.telecom.Connection
    public final void onStateChanged(int i) {
        super.onStateChanged(i);
    }
}
