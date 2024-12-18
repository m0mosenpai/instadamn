package com.facebook.cameracore.ardelivery.compression.zip;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C224079uq;
import X.C63047SbR;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class ZipDecompressor {
    public static final C63047SbR Companion = new Object();
    public static final int UNZIP_BUFFER_SIZE = 4096;

    public static final int unZipToFolderBuffered(InputStream inputStream, String str) {
        return C63047SbR.A00(inputStream, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.9uq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.9uq, java.lang.Object] */
    public C224079uq decompress(String str, String str2) {
        C224079uq c224079uq;
        AbstractC167017dG.A1N(str, str2);
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            try {
                C14360o3.A0A(fileInputStream);
                if (C63047SbR.A00(fileInputStream, str2) > 0) {
                    File A11 = AbstractC166987dD.A11(str2);
                    ?? obj = new Object();
                    obj.A00 = A11;
                    c224079uq = obj;
                } else {
                    c224079uq = new Object();
                }
                fileInputStream.close();
                return c224079uq;
            } finally {
            }
        } catch (IOException | IllegalArgumentException e) {
            e.getMessage();
            return new Object();
        }
    }

    public static final void createDirIfNotExist(String str, String str2) {
        C63047SbR.A01(str, str2);
    }
}
