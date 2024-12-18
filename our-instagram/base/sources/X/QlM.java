package X;

import com.facebook.location.platform.api.Location;

/* loaded from: classes10.dex */
public final class QlM extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C173847oc c173847oc = C173847oc.A00;
        return AbstractC58320PtC.A0U(c173847oc, AbstractC166987dD.A0i(c173847oc, Location.LATITUDE), AbstractC166987dD.A0i(c173847oc, "longitude"), AbstractC166987dD.A0i(C94894Ou.A00, "accuracy_meters"), "epoch_time_sec");
    }

    public QlM(int i) {
        super(i);
    }

    public QlM() {
        super(1195586568);
    }
}
