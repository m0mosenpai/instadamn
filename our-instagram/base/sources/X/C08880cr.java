package X;

import com.facebook.messenger.msystrace.metadataprovider.advancedcrypto.AdvancedCryptoTransportQPLMetadataProvider;
import com.facebook.messenger.msystrace.metadataprovider.advancedcrypto.AdvancedCryptoTransportQPLMetadataSnapshot;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* renamed from: X.0cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08880cr extends C0k0 {
    public static final ListenableFuture A01(AdvancedCryptoTransportQPLMetadataSnapshot advancedCryptoTransportQPLMetadataSnapshot, AdvancedCryptoTransportQPLMetadataSnapshot advancedCryptoTransportQPLMetadataSnapshot2, RunnableC16080r6 runnableC16080r6) {
        C14360o3.A0B(runnableC16080r6, 0);
        if (advancedCryptoTransportQPLMetadataSnapshot != null && advancedCryptoTransportQPLMetadataSnapshot2 != null) {
            Map generateAnnotationMap = AdvancedCryptoTransportQPLMetadataProvider.generateAnnotationMap(advancedCryptoTransportQPLMetadataSnapshot, advancedCryptoTransportQPLMetadataSnapshot2);
            C14360o3.A07(generateAnnotationMap);
            for (Map.Entry entry : generateAnnotationMap.entrySet()) {
                runnableC16080r6.BTP().A03((String) entry.getKey(), entry.getValue());
            }
        }
        ListenableFuture listenableFuture = C25191Kx.A01;
        C14360o3.A07(listenableFuture);
        return listenableFuture;
    }

    @Override // X.InterfaceC06630Wx
    public final String Bix() {
        return "act_info";
    }

    @Override // X.InterfaceC06630Wx
    public final int Biy() {
        return 34;
    }

    @Override // X.InterfaceC06630Wx
    public final boolean CTn(AbstractC208210e abstractC208210e) {
        C14360o3.A0B(abstractC208210e, 0);
        return C20150ym.A07(AbstractC20100yh.A00(36320060226150362L));
    }

    @Override // X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ ListenableFuture AON(RunnableC16080r6 runnableC16080r6, Object obj, Object obj2) {
        return A01((AdvancedCryptoTransportQPLMetadataSnapshot) obj, (AdvancedCryptoTransportQPLMetadataSnapshot) obj2, runnableC16080r6);
    }

    @Override // X.C0k0, X.InterfaceC06630Wx
    public final Class Bzs() {
        return AdvancedCryptoTransportQPLMetadataSnapshot.class;
    }

    public static final AdvancedCryptoTransportQPLMetadataSnapshot A00() {
        AdvancedCryptoTransportQPLMetadataSnapshot snapshot = AdvancedCryptoTransportQPLMetadataProvider.snapshot();
        C14360o3.A07(snapshot);
        return snapshot;
    }

    @Override // X.InterfaceC06630Wx
    public final Class ByC() {
        return Bzs();
    }

    @Override // X.C0k0, X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ Object EmJ(int i, int i2) {
        return A00();
    }
}
