package X;

import android.util.Base64;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.graphservice.interfaces.Tree;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5f4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC121565f4 {
    public static void A00(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        String name;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            boolean z = obj instanceof Tree;
            if (InterfaceC102484jg.class.isAssignableFrom(cls)) {
                C18C.A0E(z);
                Tree tree = (Tree) obj;
                int typeTag = tree.getTypeTag();
                if (z) {
                    ByteBuffer serializeTreeToByteBuffer = C63117SdL.A00().serializeTreeToByteBuffer(tree);
                    byte[] bArr = new byte[serializeTreeToByteBuffer.limit()];
                    serializeTreeToByteBuffer.get(bArr);
                    name = AnonymousClass001.A0g("tree:", StringFormatUtil.formatStrLocaleSafe("type_tag:%08x;", Integer.valueOf(typeTag)), Base64.encodeToString(bArr, 2));
                } else {
                    C0K8.A0E("AutoGenJsonHelper", "Use of deprecated flatbuffer infra");
                    return;
                }
            } else if (C2JT.class.isAssignableFrom(cls)) {
                ByteBuffer serializeTreeToByteBuffer2 = C63117SdL.A00().serializeTreeToByteBuffer((Tree) obj);
                byte[] bArr2 = new byte[serializeTreeToByteBuffer2.limit()];
                serializeTreeToByteBuffer2.get(bArr2);
                name = Base64.encodeToString(bArr2, 2);
            } else if (InterfaceC911544r.class.isAssignableFrom(cls)) {
                ((InterfaceC911544r) obj).EOr(anonymousClass182, abstractC913345m);
                return;
            } else if (cls.isEnum()) {
                name = ((Enum) obj).name();
            } else if (Collection.class.isAssignableFrom(cls)) {
                A01(anonymousClass182, abstractC913345m, (Collection) obj);
                return;
            } else {
                anonymousClass182.A0J(obj);
                return;
            }
            anonymousClass182.A0u(name);
        }
    }

    public static void A01(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Collection collection) {
        if (collection != null) {
            anonymousClass182.A0c();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                A00(anonymousClass182, abstractC913345m, it.next());
            }
            anonymousClass182.A0Z();
        }
    }

    public static void A02(AnonymousClass182 anonymousClass182, Boolean bool, String str) {
        if (bool != null) {
            anonymousClass182.A0r(str);
            anonymousClass182.A0y(bool.booleanValue());
        }
    }

    public static void A03(AnonymousClass182 anonymousClass182, Integer num, String str) {
        if (num != null) {
            anonymousClass182.A0r(str);
            anonymousClass182.A0h(num.intValue());
        }
    }

    public static void A04(AnonymousClass182 anonymousClass182, String str, String str2) {
        if (str2 != null) {
            anonymousClass182.A0r(str);
            anonymousClass182.A0u(str2);
        }
    }
}
