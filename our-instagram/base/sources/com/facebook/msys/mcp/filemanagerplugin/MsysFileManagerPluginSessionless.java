package com.facebook.msys.mcp.filemanagerplugin;

import X.AbstractC08820cl;
import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.AbstractC53713Np2;
import X.C0K8;
import android.net.Uri;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.FileManager;
import com.facebook.valueholder.ValueHolder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class MsysFileManagerPluginSessionless extends Sessionless {
    public static final String TAG = "MsysFileManagerPluginSessionless";

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public void MsysFileManagerImpl_MsysFileManagerClearURLResourcePropertyCacheFileSize(Uri uri) {
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public Uri MsysFileManagerImpl_MsysFileManagerCopyHomeDirectoryURL() {
        return null;
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public List MsysFileManagerImpl_MsysFileManagerCopyContentsOfDirectoryAtURL(Uri uri) {
        if (FileManager.sInitialized) {
            String[] listDirectory = FileManager.listDirectory(uri.toString());
            ArrayList A1E = AbstractC166987dD.A1E();
            for (String str : listDirectory) {
                A1E.add(AbstractC08820cl.A03(AbstractC53713Np2.A00(str, false)));
            }
            return A1E;
        }
        throw new MsysError(MsysError.initNativeHolder("FileManagerInitializationError", 0, null));
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public boolean MsysFileManagerImpl_MsysFileManagerCopyFile(Uri uri, Uri uri2, ValueHolder valueHolder) {
        if (FileManager.sInitialized) {
            FileManager.copyFile(uri.toString(), uri2.toString());
            return true;
        }
        throw AbstractC50523MSb.A0D();
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public Uri MsysFileManagerImpl_MsysFileManagerCreateCacheDirectory(String str) {
        if (FileManager.sInitialized) {
            return AbstractC08820cl.A03(AbstractC53713Np2.A00(FileManager.createCacheDirectory(str), true));
        }
        throw AbstractC50523MSb.A0D();
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public byte[] MsysFileManagerImpl_MsysFileManagerCreateDataWithContentsOfFile(Uri uri, int i, ValueHolder valueHolder) {
        if (FileManager.sInitialized) {
            uri.getClass();
            return FileManager.readFile(uri.toString());
        }
        throw AbstractC50523MSb.A0D();
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public boolean MsysFileManagerImpl_MsysFileManagerCreateDirectory(Uri uri) {
        if (FileManager.sInitialized) {
            FileManager.createDirectory(uri.toString());
            return true;
        }
        throw AbstractC50523MSb.A0D();
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public String MsysFileManagerImpl_MsysFileManagerCreateStringWithContentsOfFile(Uri uri, int i, ValueHolder valueHolder) {
        if (FileManager.sInitialized) {
            return new String(FileManager.readFile(uri.toString()), StandardCharsets.UTF_8);
        }
        throw new MsysError(MsysError.initNativeHolder("FileManagerInitializationError", 0, null));
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public Uri MsysFileManagerImpl_MsysFileManagerCreateTemporaryDirectoryURL() {
        if (!FileManager.sInitialized) {
            C0K8.A0C(TAG, "FileManager is not initialized");
            return null;
        }
        return AbstractC08820cl.A03(AbstractC53713Np2.A00(FileManager.mCacheDir.toString(), true));
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public boolean MsysFileManagerImpl_MsysFileManagerDeleteItem(Uri uri) {
        if (FileManager.sInitialized) {
            FileManager.deleteItem(uri.toString());
            return true;
        }
        throw AbstractC50523MSb.A0D();
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public boolean MsysFileManagerImpl_MsysFileManagerItemExists(Uri uri) {
        if (!FileManager.sInitialized) {
            C0K8.A0C(TAG, "FileManager is not initialized");
            return false;
        }
        return FileManager.itemExists(uri.toString());
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public boolean MsysFileManagerImpl_MsysFileManagerMoveFile(Uri uri, Uri uri2, ValueHolder valueHolder, ValueHolder valueHolder2) {
        if (FileManager.sInitialized) {
            FileManager.moveFile(uri.toString(), uri2.toString());
            return true;
        }
        throw AbstractC50523MSb.A0D();
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public boolean MsysFileManagerImpl_MsysFileManagerWriteDataToFile(byte[] bArr, Uri uri, ValueHolder valueHolder, boolean z) {
        if (FileManager.sInitialized) {
            FileManager.writeDataToFile(bArr, uri.toString(), z);
            return true;
        }
        throw AbstractC50523MSb.A0D();
    }

    @Override // com.facebook.msys.mcp.filemanagerplugin.Sessionless
    public boolean MsysFileManagerImpl_MsysFileManagerDeleteDatabaseFile(Uri uri) {
        return MsysFileManagerImpl_MsysFileManagerDeleteItem(uri);
    }
}
