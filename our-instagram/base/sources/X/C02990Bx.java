package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.0Bx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C02990Bx extends C03E implements InterfaceC16620sF {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C02990Bx(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L15;
                case 1: goto L1e;
                case 2: goto L27;
                case 3: goto L30;
                case 4: goto L39;
                case 5: goto L42;
                case 6: goto L4b;
                case 7: goto L54;
                case 8: goto L5d;
                case 9: goto L66;
                case 10: goto L15;
                case 11: goto L1e;
                case 12: goto L39;
                case 13: goto L42;
                case 14: goto L5d;
                case 15: goto L66;
                case 16: goto L66;
                default: goto L6;
            }
        L6:
            java.lang.Class<X.0xo> r3 = X.InterfaceC19610xo.class
            java.lang.String r4 = "putStringSet"
            java.lang.String r5 = "putStringSet(Ljava/lang/String;Ljava/util/Set;)Lcom/instagram/preferences/common/intf/KeyValueStore$Editor;"
        Le:
            r1 = 2
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L15:
            java.lang.Class<X.0xq> r3 = X.InterfaceC19630xq.class
            java.lang.String r4 = "getBoolean"
            java.lang.String r5 = "getBoolean(Ljava/lang/String;Z)Z"
            goto Le
        L1e:
            java.lang.Class<X.0xo> r3 = X.InterfaceC19610xo.class
            java.lang.String r4 = "putBoolean"
            java.lang.String r5 = "putBoolean(Ljava/lang/String;Z)Lcom/instagram/preferences/common/intf/KeyValueStore$Editor;"
            goto Le
        L27:
            java.lang.Class<X.0xq> r3 = X.InterfaceC19630xq.class
            java.lang.String r4 = "getFloat"
            java.lang.String r5 = "getFloat(Ljava/lang/String;F)F"
            goto Le
        L30:
            java.lang.Class<X.0xo> r3 = X.InterfaceC19610xo.class
            java.lang.String r4 = "putFloat"
            java.lang.String r5 = "putFloat(Ljava/lang/String;F)Lcom/instagram/preferences/common/intf/KeyValueStore$Editor;"
            goto Le
        L39:
            java.lang.Class<X.0xq> r3 = X.InterfaceC19630xq.class
            java.lang.String r4 = "getInt"
            java.lang.String r5 = "getInt(Ljava/lang/String;I)I"
            goto Le
        L42:
            java.lang.Class<X.0xo> r3 = X.InterfaceC19610xo.class
            java.lang.String r4 = "putInt"
            java.lang.String r5 = "putInt(Ljava/lang/String;I)Lcom/instagram/preferences/common/intf/KeyValueStore$Editor;"
            goto Le
        L4b:
            java.lang.Class<X.0xq> r3 = X.InterfaceC19630xq.class
            java.lang.String r4 = "getLong"
            java.lang.String r5 = "getLong(Ljava/lang/String;J)J"
            goto Le
        L54:
            java.lang.Class<X.0xo> r3 = X.InterfaceC19610xo.class
            java.lang.String r4 = "putLong"
            java.lang.String r5 = "putLong(Ljava/lang/String;J)Lcom/instagram/preferences/common/intf/KeyValueStore$Editor;"
            goto Le
        L5d:
            java.lang.Class<X.0xq> r3 = X.InterfaceC19630xq.class
            java.lang.String r4 = "getString"
            java.lang.String r5 = "getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"
            goto Le
        L66:
            java.lang.Class<X.0xo> r3 = X.InterfaceC19610xo.class
            java.lang.String r4 = "putString"
            java.lang.String r5 = "putString(Ljava/lang/String;Ljava/lang/String;)Lcom/instagram/preferences/common/intf/KeyValueStore$Editor;"
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02990Bx.<init>(java.lang.Object, int):void");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        switch (this.A00) {
            case 0:
            case 10:
                return Boolean.valueOf(((InterfaceC19630xq) this.receiver).getBoolean(str, ((Boolean) obj2).booleanValue()));
            case 1:
            case 11:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                InterfaceC19610xo interfaceC19610xo = (InterfaceC19610xo) this.receiver;
                interfaceC19610xo.E77(str, booleanValue);
                return interfaceC19610xo;
            case 2:
                return Float.valueOf(((InterfaceC19630xq) this.receiver).getFloat(str, ((Number) obj2).floatValue()));
            case 3:
                float floatValue = ((Number) obj2).floatValue();
                InterfaceC19610xo interfaceC19610xo2 = (InterfaceC19610xo) this.receiver;
                interfaceC19610xo2.E7A(str, floatValue);
                return interfaceC19610xo2;
            case 4:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return Integer.valueOf(((InterfaceC19630xq) this.receiver).getInt(str, ((Number) obj2).intValue()));
            case 5:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                int intValue = ((Number) obj2).intValue();
                InterfaceC19610xo interfaceC19610xo3 = (InterfaceC19610xo) this.receiver;
                interfaceC19610xo3.E7D(str, intValue);
                return interfaceC19610xo3;
            case 6:
                return Long.valueOf(((InterfaceC19630xq) this.receiver).getLong(str, ((Number) obj2).longValue()));
            case 7:
                long longValue = ((Number) obj2).longValue();
                InterfaceC19610xo interfaceC19610xo4 = (InterfaceC19610xo) this.receiver;
                interfaceC19610xo4.E7G(str, longValue);
                return interfaceC19610xo4;
            case 8:
            case 14:
                return ((InterfaceC19630xq) this.receiver).getString(str, (String) obj2);
            case 9:
            case Process.SIGTERM /* 15 */:
            case 16:
            default:
                InterfaceC19610xo interfaceC19610xo5 = (InterfaceC19610xo) this.receiver;
                interfaceC19610xo5.E7K(str, (String) obj2);
                return interfaceC19610xo5;
            case 17:
                InterfaceC19610xo interfaceC19610xo6 = (InterfaceC19610xo) this.receiver;
                interfaceC19610xo6.E7L(str, (java.util.Set) obj2);
                return interfaceC19610xo6;
        }
    }
}
