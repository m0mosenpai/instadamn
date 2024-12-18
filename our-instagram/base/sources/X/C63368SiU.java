package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.graphql.modelutil.parcel.ModelParcelHelper$LazyHolder;
import com.facebook.graphql.modelutil.parcel.TreeParcelable;
import com.facebook.graphservice.interfaces.Tree;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.SiU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63368SiU {
    public static Object A01(Bundle bundle, String str) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable(str)) == null) {
            return null;
        }
        return A02(parcelable);
    }

    public static Parcelable A00(Object obj) {
        if (obj instanceof Tree) {
            Tree tree = (Tree) obj;
            if (tree.isValidGraphServicesJNIModel()) {
                String A0h = MSY.A0h(tree);
                int typeTag = tree.getTypeTag();
                try {
                    ByteBuffer serializeTreeToByteBuffer = C63117SdL.A00().serializeTreeToByteBuffer(tree);
                    byte[] bArr = new byte[serializeTreeToByteBuffer.limit()];
                    serializeTreeToByteBuffer.get(bArr);
                    ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(A0U);
                        try {
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byte[] byteArray = A0U.toByteArray();
                            A0U.close();
                            TreeParcelable treeParcelable = new TreeParcelable(byteArray, typeTag, A0h);
                            treeParcelable.A00 = tree;
                            return treeParcelable;
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException unused) {
                    throw AbstractC166987dD.A12("Exception during serialization of TreeModel");
                }
            }
            throw AbstractC166987dD.A15("asTree_DO_NOT_USE");
        }
        C0K8.A0E("ModelParcelHelper", "Non-Tree type model conversion to Parcelable");
        return new ModelParcelHelper$LazyHolder(obj);
    }

    public static Object A02(Parcelable parcelable) {
        Object obj;
        if (parcelable instanceof TreeParcelable) {
            try {
                TreeParcelable treeParcelable = (TreeParcelable) parcelable;
                obj = treeParcelable.A00;
                if (obj == null) {
                    String str = treeParcelable.A02;
                    Class<?> cls = Class.forName(str);
                    if (Tree.class.isAssignableFrom(cls)) {
                        ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
                        try {
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(treeParcelable.A03);
                            try {
                                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int read = gZIPInputStream.read(bArr);
                                        if (read != -1) {
                                            A0U.write(bArr, 0, read);
                                        } else {
                                            Tree deserializeTreeFromByteBuffer = C63117SdL.A00().deserializeTreeFromByteBuffer(ByteBuffer.wrap(A0U.toByteArray()), cls, treeParcelable.A01);
                                            gZIPInputStream.close();
                                            byteArrayInputStream.close();
                                            A0U.close();
                                            treeParcelable.A00 = deserializeTreeFromByteBuffer;
                                            return deserializeTreeFromByteBuffer;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                A0U.close();
                                throw th;
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                throw th;
                            }
                        }
                    } else {
                        throw AbstractC58319PtB.A0i("Parcel does not contain valid GraphQL Tree ", str, " ", cls.getSimpleName());
                    }
                }
            } catch (Exception e) {
                throw AbstractC167007dF.A0c("Exception deserializing GraphQL model from Parcel: ", e.getMessage());
            }
        } else if (parcelable instanceof ModelParcelHelper$LazyHolder) {
            C0K8.A0E("ModelParcelHelper", "Parcelable deprecated flatbuffer model");
            obj = ((ModelParcelHelper$LazyHolder) parcelable).A00;
            if (obj != null) {
                Class<?> cls2 = obj.getClass();
                if (!Object.class.isAssignableFrom(cls2)) {
                    throw AbstractC58319PtB.A0i("Type mismatch. Expected ", Object.class.getName(), ", got ", cls2.getName());
                }
            }
        } else {
            throw AbstractC166987dD.A14("Unknown GraphQL model type in Parcel");
        }
        return obj;
    }

    public static ArrayList A03(Bundle bundle) {
        ArrayList parcelableArrayList;
        if (bundle == null || (parcelableArrayList = bundle.getParcelableArrayList("financial_entities")) == null) {
            return null;
        }
        ArrayList A11 = AbstractC58319PtB.A11(parcelableArrayList);
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            Parcelable parcelable = (Parcelable) it.next();
            if (parcelable != null) {
                A11.add(A02(parcelable));
            } else {
                A11.add(null);
            }
        }
        return A11;
    }

    public static void A04(Bundle bundle, C2JT c2jt, String str) {
        Parcelable A00;
        if (c2jt == null) {
            A00 = null;
        } else {
            A00 = A00(c2jt);
        }
        bundle.putParcelable(str, A00);
    }

    public static void A05(List list, Bundle bundle) {
        ArrayList<? extends Parcelable> A0q = AbstractC25230BEn.A0q(list);
        for (Object obj : list) {
            if (obj != null) {
                A0q.add(A00(obj));
            } else {
                A0q.add(null);
            }
        }
        bundle.putParcelableArrayList("financial_entities", A0q);
    }
}
