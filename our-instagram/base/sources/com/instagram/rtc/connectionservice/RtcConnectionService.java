package com.instagram.rtc.connectionservice;

import X.AbstractC166987dD;
import X.AbstractC31175DnJ;
import X.C023409i;
import X.C0f9;
import X.C14360o3;
import X.C1W6;
import X.C27661Vu;
import X.C3ER;
import X.C50758MbO;
import X.C9BW;
import X.MSW;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccountHandle;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes9.dex */
public final class RtcConnectionService extends ConnectionService {
    @Override // android.telecom.ConnectionService
    public final Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        Bundle bundle;
        String string;
        String string2;
        C14360o3.A0B(connectionRequest, 1);
        UserSession A0Q = MSW.A0Q(this);
        C1W6 c1w6 = (C1W6) ((C27661Vu) C3ER.A00()).A07.getValue();
        Bundle extras = connectionRequest.getExtras();
        if (extras != null && (bundle = extras.getBundle("android.telecom.extra.INCOMING_CALL_EXTRAS")) != null && (string = bundle.getString("com.instagram.rtc.connection.connection_id")) != null && (string2 = bundle.getString("com.instagram.rtc.connection.display_name")) != null) {
            Uri address = connectionRequest.getAddress();
            C14360o3.A07(address);
            int videoState = connectionRequest.getVideoState();
            C50758MbO c50758MbO = new C50758MbO(A0Q, c1w6, string);
            c50758MbO.setConnectionProperties(128);
            c50758MbO.setAddress(address, 1);
            c50758MbO.setCallerDisplayName(string2, 1);
            c50758MbO.setVideoState(videoState);
            c50758MbO.setRinging();
            c50758MbO.setExtras(extras);
            return c50758MbO;
        }
        Connection createFailedConnection = Connection.createFailedConnection(new DisconnectCause(1));
        C14360o3.A07(createFailedConnection);
        return createFailedConnection;
    }

    @Override // android.telecom.ConnectionService
    public final void onCreateIncomingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        C14360o3.A0B(connectionRequest, 1);
        super.onCreateIncomingConnectionFailed(phoneAccountHandle, connectionRequest);
    }

    @Override // android.telecom.ConnectionService
    public final Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        C14360o3.A0B(connectionRequest, 1);
        UserSession A0Q = MSW.A0Q(this);
        C1W6 c1w6 = (C1W6) ((C27661Vu) C3ER.A00()).A07.getValue();
        Bundle extras = connectionRequest.getExtras();
        String string = extras.getString("com.instagram.rtc.connection.connection_id");
        if (string == null) {
            Connection createFailedConnection = Connection.createFailedConnection(new DisconnectCause(1));
            C14360o3.A07(createFailedConnection);
            return createFailedConnection;
        }
        String A0Y = AbstractC31175DnJ.A0Y(extras, "com.instagram.rtc.connection.display_name");
        Uri address = connectionRequest.getAddress();
        C14360o3.A07(address);
        int videoState = connectionRequest.getVideoState();
        C50758MbO c50758MbO = new C50758MbO(A0Q, c1w6, string);
        c50758MbO.setConnectionProperties(128);
        c50758MbO.setAddress(address, 1);
        c50758MbO.setCallerDisplayName(A0Y, 1);
        c50758MbO.setVideoState(videoState);
        c50758MbO.setDialing();
        c50758MbO.setExtras(extras);
        C9BW A00 = C1W6.A00(c1w6, c50758MbO, string);
        if (A00 == null) {
            return c50758MbO;
        }
        C1W6.A03((Bundle) A00.A01, A0Q, c1w6, string);
        return c50758MbO;
    }

    @Override // android.telecom.ConnectionService
    public final void onCreateOutgoingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        C14360o3.A0B(connectionRequest, 1);
        super.onCreateOutgoingConnectionFailed(phoneAccountHandle, connectionRequest);
        C023409i.A0A.A08(this);
        C1W6 c1w6 = (C1W6) ((C27661Vu) C3ER.A00()).A07.getValue();
        RuntimeException A18 = AbstractC166987dD.A18("Unable to make outgoing call");
        ConcurrentMap concurrentMap = c1w6.A03;
        C9BW c9bw = (C9BW) concurrentMap.get("outgoing_default_connection_id");
        if (c9bw != null) {
            concurrentMap.remove("outgoing_default_connection_id");
            C1W6.A04((Bundle) c9bw.A01, c1w6, A18);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(-2077193919);
        super.onCreate();
        C0f9.A0B(441666058, A04);
    }
}
