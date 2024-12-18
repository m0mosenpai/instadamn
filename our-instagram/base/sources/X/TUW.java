package X;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.instagram.react.modules.base.IgNetworkingModule;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class TUW implements Callable {
    public final /* synthetic */ ReadableArray A00;
    public final /* synthetic */ ReadableMap A01;
    public final /* synthetic */ IgNetworkingModule A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public TUW(ReadableArray readableArray, ReadableMap readableMap, IgNetworkingModule igNetworkingModule, String str, String str2) {
        this.A02 = igNetworkingModule;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = readableArray;
        this.A01 = readableMap;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1QW buildRequest;
        buildRequest = this.A02.buildRequest(this.A03, this.A04, this.A00, this.A01);
        C1QX A0J = MSY.A0J();
        A0J.A03 = C1Ef.OnScreen;
        return AbstractC58319PtB.A0d(buildRequest, A0J);
    }
}
