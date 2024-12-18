package com.facebook.msys.mcp.filemanagerplugin;

import android.net.Uri;
import com.facebook.valueholder.ValueHolder;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class Sessionless {
    private byte[] MsysFileManagerImpl_MsysFileManagerCreateDataWithContentsOfFileJNI(Uri uri, int i, ValueHolder valueHolder) {
        if (uri == null) {
            uri = null;
        }
        return MsysFileManagerImpl_MsysFileManagerCreateDataWithContentsOfFile(uri, i, valueHolder);
    }

    public abstract void MsysFileManagerImpl_MsysFileManagerClearURLResourcePropertyCacheFileSize(Uri uri);

    public abstract List MsysFileManagerImpl_MsysFileManagerCopyContentsOfDirectoryAtURL(Uri uri);

    public abstract boolean MsysFileManagerImpl_MsysFileManagerCopyFile(Uri uri, Uri uri2, ValueHolder valueHolder);

    public abstract Uri MsysFileManagerImpl_MsysFileManagerCopyHomeDirectoryURL();

    public abstract Uri MsysFileManagerImpl_MsysFileManagerCreateCacheDirectory(String str);

    public abstract byte[] MsysFileManagerImpl_MsysFileManagerCreateDataWithContentsOfFile(Uri uri, int i, ValueHolder valueHolder);

    public abstract boolean MsysFileManagerImpl_MsysFileManagerCreateDirectory(Uri uri);

    public abstract String MsysFileManagerImpl_MsysFileManagerCreateStringWithContentsOfFile(Uri uri, int i, ValueHolder valueHolder);

    public abstract Uri MsysFileManagerImpl_MsysFileManagerCreateTemporaryDirectoryURL();

    public abstract boolean MsysFileManagerImpl_MsysFileManagerDeleteDatabaseFile(Uri uri);

    public abstract boolean MsysFileManagerImpl_MsysFileManagerDeleteItem(Uri uri);

    public abstract boolean MsysFileManagerImpl_MsysFileManagerItemExists(Uri uri);

    public abstract boolean MsysFileManagerImpl_MsysFileManagerMoveFile(Uri uri, Uri uri2, ValueHolder valueHolder, ValueHolder valueHolder2);

    public abstract boolean MsysFileManagerImpl_MsysFileManagerWriteDataToFile(byte[] bArr, Uri uri, ValueHolder valueHolder, boolean z);

    private Uri MsysFileManagerImpl_MsysFileManagerCopyHomeDirectoryURLJNI() {
        return null;
    }

    private List MsysFileManagerImpl_MsysFileManagerCopyContentsOfDirectoryAtURLJNI(Uri uri) {
        return MsysFileManagerImpl_MsysFileManagerCopyContentsOfDirectoryAtURL(uri);
    }

    private boolean MsysFileManagerImpl_MsysFileManagerCopyFileJNI(Uri uri, Uri uri2, ValueHolder valueHolder) {
        return MsysFileManagerImpl_MsysFileManagerCopyFile(uri, uri2, valueHolder);
    }

    private Uri MsysFileManagerImpl_MsysFileManagerCreateCacheDirectoryJNI(String str) {
        Uri MsysFileManagerImpl_MsysFileManagerCreateCacheDirectory = MsysFileManagerImpl_MsysFileManagerCreateCacheDirectory(str);
        if (MsysFileManagerImpl_MsysFileManagerCreateCacheDirectory == null) {
            return null;
        }
        return MsysFileManagerImpl_MsysFileManagerCreateCacheDirectory;
    }

    private boolean MsysFileManagerImpl_MsysFileManagerCreateDirectoryJNI(Uri uri) {
        return MsysFileManagerImpl_MsysFileManagerCreateDirectory(uri);
    }

    private String MsysFileManagerImpl_MsysFileManagerCreateStringWithContentsOfFileJNI(Uri uri, int i, ValueHolder valueHolder) {
        return MsysFileManagerImpl_MsysFileManagerCreateStringWithContentsOfFile(uri, i, valueHolder);
    }

    private Uri MsysFileManagerImpl_MsysFileManagerCreateTemporaryDirectoryURLJNI() {
        Uri MsysFileManagerImpl_MsysFileManagerCreateTemporaryDirectoryURL = MsysFileManagerImpl_MsysFileManagerCreateTemporaryDirectoryURL();
        if (MsysFileManagerImpl_MsysFileManagerCreateTemporaryDirectoryURL == null) {
            return null;
        }
        return MsysFileManagerImpl_MsysFileManagerCreateTemporaryDirectoryURL;
    }

    private boolean MsysFileManagerImpl_MsysFileManagerDeleteDatabaseFileJNI(Uri uri) {
        return MsysFileManagerImpl_MsysFileManagerDeleteItem(uri);
    }

    private boolean MsysFileManagerImpl_MsysFileManagerDeleteItemJNI(Uri uri) {
        return MsysFileManagerImpl_MsysFileManagerDeleteItem(uri);
    }

    private boolean MsysFileManagerImpl_MsysFileManagerItemExistsJNI(Uri uri) {
        return MsysFileManagerImpl_MsysFileManagerItemExists(uri);
    }

    private boolean MsysFileManagerImpl_MsysFileManagerMoveFileJNI(Uri uri, Uri uri2, ValueHolder valueHolder, ValueHolder valueHolder2) {
        return MsysFileManagerImpl_MsysFileManagerMoveFile(uri, uri2, valueHolder, valueHolder2);
    }

    private boolean MsysFileManagerImpl_MsysFileManagerWriteDataToFileJNI(byte[] bArr, Uri uri, ValueHolder valueHolder, boolean z) {
        return MsysFileManagerImpl_MsysFileManagerWriteDataToFile(bArr, uri, valueHolder, z);
    }

    private void MsysFileManagerImpl_MsysFileManagerClearURLResourcePropertyCacheFileSizeJNI(Uri uri) {
    }
}
