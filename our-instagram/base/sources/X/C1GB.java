package X;

import com.facebook.tigon.tigonobserver.TigonBodyObservation;
import com.facebook.tigon.tigonobserver.TigonObservable;
import com.facebook.tigon.tigonobserver.TigonObserverData;

/* renamed from: X.1GB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1GB implements Runnable {
    public int A00;
    public TigonBodyObservation A01;
    public TigonObserverData A02;
    public final String A03 = C1GB.class.getSimpleName();
    public final /* synthetic */ TigonObservable A04;

    public C1GB(TigonObservable tigonObservable) {
        this.A04 = tigonObservable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TigonObservable tigonObservable;
        switch (this.A00) {
            case 0:
                this.A02.getClass();
                tigonObservable = this.A04;
                TigonObserverData tigonObserverData = this.A02;
                String str = TigonObservable.TAG;
                for (C1G7 c1g7 : tigonObservable.mObservers) {
                    if (tigonObserverData.submittedRequest() == null) {
                        C0K8.A0P("TigonObservable", "SubmittedRequest was null before callOnAdded for id %d", Long.valueOf(tigonObserverData.requestId()));
                    }
                    c1g7.Cvo(tigonObserverData);
                }
                break;
            case 1:
                this.A02.getClass();
                tigonObservable = this.A04;
                TigonObserverData tigonObserverData2 = this.A02;
                String str2 = TigonObservable.TAG;
                for (C1G7 c1g72 : tigonObservable.mObservers) {
                    c1g72.DoJ(tigonObserverData2);
                }
                break;
            case 2:
                this.A02.getClass();
                tigonObservable = this.A04;
                TigonObserverData tigonObserverData3 = this.A02;
                String str3 = TigonObservable.TAG;
                for (C1G7 c1g73 : tigonObservable.mObservers) {
                    c1g73.Dgf(tigonObserverData3);
                }
                break;
            case 3:
                this.A02.getClass();
                tigonObservable = this.A04;
                TigonObserverData tigonObserverData4 = this.A02;
                String str4 = TigonObservable.TAG;
                for (C1G7 c1g74 : tigonObservable.mObservers) {
                    c1g74.DCj(tigonObserverData4);
                }
                break;
            case 4:
                this.A02.getClass();
                tigonObservable = this.A04;
                TigonObserverData tigonObserverData5 = this.A02;
                String str5 = TigonObservable.TAG;
                for (C1G7 c1g75 : tigonObservable.mObservers) {
                    c1g75.DEC(tigonObserverData5);
                }
                break;
            case 5:
                this.A02.getClass();
                tigonObservable = this.A04;
                TigonObserverData tigonObserverData6 = this.A02;
                String str6 = TigonObservable.TAG;
                for (C1G7 c1g76 : tigonObservable.mObservers) {
                    c1g76.E23(tigonObserverData6);
                }
                break;
            case 6:
                this.A01.getClass();
                tigonObservable = this.A04;
                String str7 = TigonObservable.TAG;
                if (0 < tigonObservable.mDebugObservers.length) {
                    throw new NullPointerException("onUploadBody");
                }
                break;
            case 7:
                this.A01.getClass();
                tigonObservable = this.A04;
                String str8 = TigonObservable.TAG;
                if (0 < tigonObservable.mDebugObservers.length) {
                    throw new NullPointerException("onDownloadBody");
                }
                break;
            default:
                throw new AssertionError("Unknown ObserverStep");
        }
        tigonObservable.mObjectPool.A02(this);
    }
}
