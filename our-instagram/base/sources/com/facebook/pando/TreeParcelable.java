package com.facebook.pando;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C0K8;
import X.C14360o3;
import X.C61810Ru4;
import X.C63473SlE;
import X.MSY;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes10.dex */
public class TreeParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(49);
    public final TreeJNI A00;

    public static TreeJNI A00(Parcel parcel) {
        String readString;
        if (parcel == null || (readString = parcel.readString()) == null) {
            return null;
        }
        Class<?> cls = Class.forName(readString);
        if (TreeJNI.class.isAssignableFrom(cls)) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int read = gZIPInputStream.read(bArr2);
                            if (read == -1) {
                                break;
                            }
                            A0U.write(bArr2, 0, read);
                        }
                        ByteBuffer wrap = ByteBuffer.wrap(A0U.toByteArray());
                        C61810Ru4 c61810Ru4 = TreeSerializer.Companion;
                        AbstractC167017dG.A1N(wrap, cls);
                        if (!wrap.isDirect()) {
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(wrap.capacity());
                            C14360o3.A07(allocateDirect);
                            if (allocateDirect.isDirect()) {
                                allocateDirect.put(wrap.duplicate());
                                allocateDirect.position(0);
                                wrap = allocateDirect;
                            } else {
                                throw AbstractC166987dD.A1D("Direct ByteBuffer is not supported on this platform");
                            }
                        }
                        TreeJNI deserializeFromBytesNative = TreeSerializer.deserializeFromBytesNative(wrap, cls);
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        A0U.close();
                        return deserializeFromBytesNative;
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    A0U.close();
                    throw th;
                } finally {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                }
            }
        }
        throw AbstractC58319PtB.A0i("Parcel does not contain valid Pando tree.", readString, " ", cls.getSimpleName());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static void A01(Parcel parcel, TreeJNI treeJNI) {
        if (treeJNI != null) {
            parcel.writeString(MSY.A0h(treeJNI));
            try {
                ByteBuffer serializeAsBytes = TreeSerializer.serializeAsBytes(treeJNI);
                byte[] bArr = new byte[serializeAsBytes.limit()];
                serializeAsBytes.get(bArr);
                ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(A0U);
                    try {
                        gZIPOutputStream.write(bArr);
                        gZIPOutputStream.close();
                        byte[] byteArray = A0U.toByteArray();
                        A0U.close();
                        parcel.writeInt(byteArray.length);
                        parcel.writeByteArray(byteArray);
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e) {
                throw e;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        try {
            A01(parcel, this.A00);
        } catch (Exception e) {
            C0K8.A0Q("TreeParcelable::writeToParcel", "Failed to write Pando tree to parcel: %s", e.toString());
        }
    }

    public TreeParcelable(TreeJNI treeJNI) {
        this.A00 = treeJNI;
    }
}
