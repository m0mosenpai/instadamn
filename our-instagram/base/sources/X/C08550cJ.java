package X;

import com.facebook.messenger.msystrace.metadataprovider.MsysQPLMetadataProvider;
import com.facebook.messenger.msystrace.metadataprovider.MsysQPLMetadataSnapshot;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* renamed from: X.0cJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08550cJ extends C0k0 {
    public static final ListenableFuture A00(MsysQPLMetadataSnapshot msysQPLMetadataSnapshot, MsysQPLMetadataSnapshot msysQPLMetadataSnapshot2, RunnableC16080r6 runnableC16080r6) {
        C14360o3.A0B(runnableC16080r6, 0);
        if (msysQPLMetadataSnapshot != null && msysQPLMetadataSnapshot2 != null) {
            Map generateAnnotationMap = MsysQPLMetadataProvider.generateAnnotationMap(msysQPLMetadataSnapshot, msysQPLMetadataSnapshot2);
            C14360o3.A07(generateAnnotationMap);
            for (Map.Entry entry : generateAnnotationMap.entrySet()) {
                runnableC16080r6.BTP().A03((String) entry.getKey(), entry.getValue());
            }
        }
        ListenableFuture listenableFuture = C25191Kx.A01;
        C14360o3.A07(listenableFuture);
        return listenableFuture;
    }

    @Override // X.C0k0, X.InterfaceC06630Wx
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final MsysQPLMetadataSnapshot EmJ(int i, int i2) {
        MsysQPLMetadataSnapshot snapshot = MsysQPLMetadataProvider.snapshot(false, i, i2);
        C14360o3.A07(snapshot);
        return snapshot;
    }

    @Override // X.InterfaceC06630Wx
    public final String Bix() {
        return "msys_info";
    }

    @Override // X.InterfaceC06630Wx
    public final int Biy() {
        return 40;
    }

    @Override // X.InterfaceC06630Wx
    public final boolean CTn(AbstractC208210e abstractC208210e) {
        C14360o3.A0B(abstractC208210e, 0);
        return C20150ym.A07(AbstractC20100yh.A00(36315022229507025L));
    }

    @Override // X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ ListenableFuture AON(RunnableC16080r6 runnableC16080r6, Object obj, Object obj2) {
        return A00((MsysQPLMetadataSnapshot) obj, (MsysQPLMetadataSnapshot) obj2, runnableC16080r6);
    }

    @Override // X.C0k0, X.InterfaceC06630Wx
    public final Class Bzs() {
        return MsysQPLMetadataSnapshot.class;
    }

    @Override // X.InterfaceC06630Wx
    public final Class ByC() {
        return Bzs();
    }
}
