package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.odin.model.OdinContext;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.94D, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C94D {
    public final InterfaceC40711ue A00;

    public C94D(InterfaceC40711ue interfaceC40711ue) {
        C14360o3.A0B(interfaceC40711ue, 1);
        this.A00 = interfaceC40711ue;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.concurrent.Future, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final AnonymousClass436 A00(Integer num, String str, String str2, String str3, String str4, List list) {
        String str5;
        ImmutableList immutableList;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        C14360o3.A0B(num, 3);
        ?? obj = new Object();
        try {
            AYC ayc = (AYC) AD4.class.getMethod("create", new Class[0]).invoke(null, new Object[0]);
            String str6 = "";
            if ("".length() == 0) {
                str6 = "59705010009496";
            }
            C2JM c2jm = ayc.A00;
            c2jm.A04("test_id", str6);
            ayc.A04 = true;
            c2jm.A04("usecase", str);
            ayc.A05 = true;
            c2jm.A04("purpose", str3);
            ayc.A03 = true;
            c2jm.A04("version", str2);
            ayc.A06 = true;
            if (num.intValue() != 0) {
                str5 = "INFER";
            } else {
                str5 = "TRAIN";
            }
            c2jm.A04("client_msg_type", str5);
            ayc.A02 = true;
            c2jm.A04("client_msg", str4);
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    OdinContext odinContext = (OdinContext) it.next();
                    C2JO c2jo = new C2JO();
                    Map map = odinContext.A03;
                    ArrayList arrayList2 = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        C2JO c2jo2 = new C2JO();
                        c2jo2.A07(Integer.valueOf(Integer.parseInt((String) entry.getKey())), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        c2jo2.A07(Integer.valueOf((int) ((Number) entry.getValue()).longValue()), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        arrayList2.add(c2jo2);
                    }
                    c2jo.A05("int_features", arrayList2);
                    Map map2 = odinContext.A02;
                    ArrayList arrayList3 = new ArrayList(map2.size());
                    for (Map.Entry entry2 : map2.entrySet()) {
                        C2JO c2jo3 = new C2JO();
                        c2jo3.A07(Integer.valueOf(Integer.parseInt((String) entry2.getKey())), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        C0CA.A00(c2jo3.A02(), entry2.getValue(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        arrayList3.add(c2jo3);
                    }
                    c2jo.A05("float_features", arrayList3);
                    Map map3 = odinContext.A04;
                    ArrayList arrayList4 = new ArrayList(map3.size());
                    for (Map.Entry entry3 : map3.entrySet()) {
                        C2JO c2jo4 = new C2JO();
                        c2jo4.A07(Integer.valueOf(Integer.parseInt((String) entry3.getKey())), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        c2jo4.A09((String) entry3.getValue(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        arrayList4.add(c2jo4);
                    }
                    c2jo.A05("string_features", arrayList4);
                    arrayList.add(c2jo);
                }
                immutableList = ImmutableList.copyOf((Collection) arrayList);
            } else {
                immutableList = null;
            }
            c2jm.A05("contexts", immutableList);
            C1Dk A00 = ayc.A00();
            this.A00.ATV(new AXW(obj), new C23372AXw(obj), A00);
            return (AnonymousClass436) obj.get();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
