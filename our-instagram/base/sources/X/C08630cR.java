package X;

import com.facebook.messenger.mcp.metadataprovider.McpHealthQPLMetadataProvider;
import com.facebook.messenger.mcp.metadataprovider.McpHealthQPLMetadataSnapshot;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* renamed from: X.0cR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08630cR extends C0k0 {
    @Override // X.InterfaceC06630Wx
    public final String Bix() {
        return "mcp_health";
    }

    @Override // X.InterfaceC06630Wx
    public final int Biy() {
        return 59;
    }

    public static final ListenableFuture A01(McpHealthQPLMetadataSnapshot mcpHealthQPLMetadataSnapshot, McpHealthQPLMetadataSnapshot mcpHealthQPLMetadataSnapshot2, RunnableC16080r6 runnableC16080r6) {
        if (mcpHealthQPLMetadataSnapshot != null && mcpHealthQPLMetadataSnapshot2 != null) {
            for (Map.Entry entry : McpHealthQPLMetadataProvider.generateAnnotationMap(mcpHealthQPLMetadataSnapshot, mcpHealthQPLMetadataSnapshot2).entrySet()) {
                if (entry.getValue() != null) {
                    runnableC16080r6.BTP().A03((String) entry.getKey(), entry.getValue().toString());
                }
            }
        }
        return C25191Kx.A01;
    }

    @Override // X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ ListenableFuture AON(RunnableC16080r6 runnableC16080r6, Object obj, Object obj2) {
        return A01((McpHealthQPLMetadataSnapshot) obj, (McpHealthQPLMetadataSnapshot) obj2, runnableC16080r6);
    }

    @Override // X.InterfaceC06630Wx
    public final Class ByC() {
        return McpHealthQPLMetadataSnapshot.class;
    }

    public static final McpHealthQPLMetadataSnapshot A00(int i, int i2) {
        return McpHealthQPLMetadataProvider.snapshot(i, i2);
    }

    @Override // X.C0k0, X.InterfaceC06630Wx
    public final /* bridge */ /* synthetic */ Object EmJ(int i, int i2) {
        return A00(i, i2);
    }

    @Override // X.InterfaceC06630Wx
    public final boolean CTn(AbstractC208210e abstractC208210e) {
        return C20150ym.A07(AbstractC20100yh.A00(36323968646590188L));
    }
}
