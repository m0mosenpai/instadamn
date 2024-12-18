package com.facebook.msys.mcp.cryptoplugin;

import X.AbstractC58318PtA;
import android.net.Uri;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes10.dex */
public class MsysCryptoPluginSessionless extends Sessionless {
    @Override // com.facebook.msys.mcp.cryptoplugin.Sessionless
    public String MsysCryptoImpl_MsysCryptoCreateMD5DigestHandler(byte[] bArr) {
        return AbstractC58318PtA.A0m(StandardCharsets.UTF_8, DefaultCrypto.A00.computeMd5(bArr));
    }

    @Override // com.facebook.msys.mcp.cryptoplugin.Sessionless
    public String MsysCryptoImpl_MsysCryptoCreateMD5DigestHandlerV2(byte[] bArr) {
        return AbstractC58318PtA.A0m(StandardCharsets.UTF_8, DefaultCrypto.A00.computeMd5V2(bArr));
    }

    @Override // com.facebook.msys.mcp.cryptoplugin.Sessionless
    public String MsysCryptoImpl_MsysCryptoCreateSHA256DigestHandler(byte[] bArr, String str) {
        return DefaultCrypto.A00.computeSHA256(bArr, str);
    }

    @Override // com.facebook.msys.mcp.cryptoplugin.Sessionless
    public String MsysCryptoImpl_MsysCryptoCreateSHA256HashFromFileUrl(Uri uri, String str) {
        try {
            return DefaultCrypto.A00.computeSHA256(uri.toString(), str);
        } catch (IOException e) {
            throw AbstractC58318PtA.A0e("Failed to compute SHA256.", e);
        }
    }
}
