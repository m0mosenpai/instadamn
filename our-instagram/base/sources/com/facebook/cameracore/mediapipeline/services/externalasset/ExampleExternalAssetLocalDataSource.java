package com.facebook.cameracore.mediapipeline.services.externalasset;

import X.AbstractC43591JPw;
import X.C05F;
import com.facebook.native_bridge.NativeDataPromise;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* loaded from: classes4.dex */
public class ExampleExternalAssetLocalDataSource implements ExternalAssetLocalDataSource {
    private String getLocalFilePath(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        try {
            URL url = new URI(str).toURL();
            String protocol = url.getProtocol();
            if (protocol != null && protocol.equals("file")) {
                str2 = url.getPath();
                return str2;
            }
        } catch (MalformedURLException | URISyntaxException unused) {
        }
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.cameracore.mediapipeline.services.externalasset.ExternalAssetResponse, java.lang.Object] */
    @Override // com.facebook.cameracore.mediapipeline.services.externalasset.ExternalAssetLocalDataSource
    public boolean getAsset(NativeDataPromise nativeDataPromise, String str, String str2) {
        String localFilePath = getLocalFilePath(str);
        if (localFilePath == null) {
            return false;
        }
        File file = new File(localFilePath);
        byte[] bArr = new byte[(int) file.length()];
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
            try {
                dataInputStream.readFully(bArr);
                ?? obj = new Object();
                obj.buffer = bArr;
                obj.length = (int) file.length();
                obj.completed = true;
                nativeDataPromise.setValue(obj);
                dataInputStream.close();
                return true;
            } finally {
            }
        } catch (IOException unused) {
            nativeDataPromise.setException("ExampleExternalAssetLocalDataSource fails to load file.");
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.cameracore.mediapipeline.services.externalasset.ExternalAssetLocalDataSource
    public String getStreamingURI(String str, String str2) {
        Integer num;
        String localFilePath;
        switch (str2.hashCode()) {
            case -384488815:
                if (str2.equals("model/gltf-binary")) {
                    num = C05F.A0C;
                    break;
                }
                num = C05F.A0N;
                break;
            case 452781974:
                if (str2.equals(AbstractC43591JPw.A00(222))) {
                    num = C05F.A01;
                    break;
                }
                num = C05F.A0N;
                break;
            case 1911932022:
                if (str2.equals("image/*")) {
                    num = C05F.A00;
                    break;
                }
                num = C05F.A0N;
                break;
            default:
                num = C05F.A0N;
                break;
        }
        if (num != C05F.A01 || (localFilePath = getLocalFilePath(str)) == null) {
            return null;
        }
        File file = new File(localFilePath);
        if (!file.isFile()) {
            return null;
        }
        return file.toURI().toString();
    }
}
