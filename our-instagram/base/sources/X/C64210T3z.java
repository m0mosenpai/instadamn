package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.T3z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64210T3z implements InterfaceC65394TjR {
    public final SOM A00;
    public final InterfaceC65393TjQ A01;
    public final AbstractC61582Rq6 A02;
    public final InterfaceC65239TgV A03;
    public final String A04;

    @Override // X.InterfaceC65394TjR
    public final void EN0(RlA rlA) {
        final InterfaceC65237TgT interfaceC65237TgT = new InterfaceC65237TgT() { // from class: X.T41
        };
        InterfaceC65239TgV interfaceC65239TgV = this.A03;
        AbstractC61582Rq6 abstractC61582Rq6 = this.A02;
        String str = this.A04;
        InterfaceC65393TjQ interfaceC65393TjQ = this.A01;
        SOM som = this.A00;
        if ("".isEmpty()) {
            T43 t43 = (T43) interfaceC65239TgV;
            InterfaceC65241TgX interfaceC65241TgX = t43.A00;
            C60630REp c60630REp = (C60630REp) rlA;
            EnumC61103RfI enumC61103RfI = c60630REp.A00;
            C60639REy c60639REy = (C60639REy) abstractC61582Rq6;
            String str2 = c60639REy.A01;
            if (str2 != null) {
                if (enumC61103RfI != null) {
                    final C60639REy A00 = S2F.A00(enumC61103RfI, str2, c60639REy.A02);
                    HashMap A1G = AbstractC166987dD.A1G();
                    final C60638REx A002 = S2E.A00(new C62740SOg(som, interfaceC65393TjQ.ABy(c60630REp.A01)), null, Long.valueOf(t43.A02.C8K()), Long.valueOf(t43.A03.C8K()), str, A1G);
                    final T47 t47 = (T47) interfaceC65241TgX;
                    t47.A04.execute(new Runnable() { // from class: X.TQj
                        @Override // java.lang.Runnable
                        public final void run() {
                            long insert;
                            byte[] bArr;
                            long insert2;
                            T47 t472 = t47;
                            AbstractC61582Rq6 abstractC61582Rq62 = A00;
                            AbstractC61581Rq5 abstractC61581Rq5 = A002;
                            try {
                                InterfaceC65396TjT interfaceC65396TjT = t472.A00;
                                C60639REy c60639REy2 = (C60639REy) abstractC61582Rq62;
                                String str3 = c60639REy2.A01;
                                InterfaceC65397TjU AXF = interfaceC65396TjT.AXF(str3);
                                if (AXF == null) {
                                    T47.A05.warning(String.format("Transport backend '%s' is not registered", str3));
                                    return;
                                }
                                C60638REx AOM = AXF.AOM(abstractC61581Rq5);
                                T49 t49 = (T49) t472.A03;
                                SQLiteDatabase A03 = t49.A03();
                                T49.A02(A03, t49);
                                try {
                                    T49 t492 = (T49) t472.A02;
                                    EnumC61103RfI enumC61103RfI2 = c60639REy2.A00;
                                    String str4 = AOM.A04;
                                    String.format("Storing event with priority=%s, name=%s for destination %s", enumC61103RfI2, str4, str3);
                                    SQLiteDatabase A032 = t492.A03();
                                    C0fW.A01(A032, -1684447961);
                                    try {
                                        long A0G = AbstractC58321PtD.A0G(t492);
                                        RF2 rf2 = (RF2) t492.A01;
                                        if (A0G >= rf2.A04) {
                                            t492.ECW(Rj4.CACHE_FULL, str4, 1L);
                                            insert2 = -1;
                                        } else {
                                            Long A003 = T49.A00(A032, abstractC61582Rq62);
                                            if (A003 != null) {
                                                insert = A003.longValue();
                                            } else {
                                                ContentValues contentValues = new ContentValues();
                                                contentValues.put("backend_name", str3);
                                                contentValues.put("priority", Integer.valueOf(AbstractC62859SUg.A00(enumC61103RfI2)));
                                                contentValues.put("next_request_ms", (Integer) 0);
                                                byte[] bArr2 = c60639REy2.A02;
                                                if (bArr2 != null) {
                                                    contentValues.put(Location.EXTRAS, Base64.encodeToString(bArr2, 0));
                                                }
                                                C0fW.A00(-45020059);
                                                insert = A032.insert("transport_contexts", null, contentValues);
                                                C0fW.A00(-688351506);
                                            }
                                            int i = rf2.A02;
                                            C62740SOg c62740SOg = AOM.A02;
                                            byte[] bArr3 = c62740SOg.A01;
                                            int length = bArr3.length;
                                            boolean A1P = AbstractC58319PtB.A1P(length, i);
                                            ContentValues contentValues2 = new ContentValues();
                                            contentValues2.put("context_id", Long.valueOf(insert));
                                            contentValues2.put("transport_name", str4);
                                            contentValues2.put(AbstractC111324zv.A00(1341), Long.valueOf(AOM.A00));
                                            contentValues2.put("uptime_ms", Long.valueOf(AOM.A01));
                                            contentValues2.put("payload_encoding", c62740SOg.A00.A00);
                                            contentValues2.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, AOM.A03);
                                            contentValues2.put("num_attempts", (Integer) 0);
                                            contentValues2.put("inline", Boolean.valueOf(A1P));
                                            if (A1P) {
                                                bArr = bArr3;
                                            } else {
                                                bArr = new byte[0];
                                            }
                                            contentValues2.put("payload", bArr);
                                            C0fW.A00(-1135452151);
                                            insert2 = A032.insert("events", null, contentValues2);
                                            C0fW.A00(385815105);
                                            if (!A1P) {
                                                int ceil = (int) Math.ceil(length / i);
                                                for (int i2 = 1; i2 <= ceil; i2++) {
                                                    byte[] copyOfRange = Arrays.copyOfRange(bArr3, (i2 - 1) * i, Math.min(i2 * i, length));
                                                    ContentValues contentValues3 = new ContentValues();
                                                    contentValues3.put("event_id", Long.valueOf(insert2));
                                                    contentValues3.put("sequence_num", Integer.valueOf(i2));
                                                    contentValues3.put("bytes", copyOfRange);
                                                    C0fW.A00(-2045053647);
                                                    A032.insert("event_payloads", null, contentValues3);
                                                    C0fW.A00(-111369025);
                                                }
                                            }
                                            Iterator A15 = AbstractC166997dE.A15(Collections.unmodifiableMap(AOM.A05));
                                            while (A15.hasNext()) {
                                                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                                                ContentValues contentValues4 = new ContentValues();
                                                contentValues4.put("event_id", Long.valueOf(insert2));
                                                contentValues4.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, AbstractC31172DnG.A17(A1K));
                                                contentValues4.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, AbstractC58318PtA.A0p(A1K));
                                                C0fW.A00(-17806623);
                                                A032.insert("event_metadata", null, contentValues4);
                                                C0fW.A00(84745537);
                                            }
                                        }
                                        Long valueOf = Long.valueOf(insert2);
                                        A032.setTransactionSuccessful();
                                        C0fW.A03(A032, 1571926387);
                                        long longValue = valueOf.longValue();
                                        if (longValue >= 1) {
                                            new RF3(AOM, abstractC61582Rq62, longValue);
                                        }
                                        ((T48) t472.A01).EM2(abstractC61582Rq62, 1, false);
                                        A03.setTransactionSuccessful();
                                        C0fW.A03(A03, 1896311136);
                                    } catch (Throwable th) {
                                        C0fW.A03(A032, -1029534431);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    C0fW.A03(A03, -274389898);
                                    throw th2;
                                }
                            } catch (Exception e) {
                                T47.A05.warning(AbstractC166997dE.A0y("Error scheduling event ", e));
                            }
                        }
                    });
                    return;
                }
                throw AbstractC166987dD.A15("Null priority");
            }
            throw AbstractC166987dD.A15("Null backendName");
        }
        throw AbstractC31175DnJ.A0V("Missing required properties:", "");
    }

    public C64210T3z(SOM som, InterfaceC65393TjQ interfaceC65393TjQ, AbstractC61582Rq6 abstractC61582Rq6, InterfaceC65239TgV interfaceC65239TgV, String str) {
        this.A02 = abstractC61582Rq6;
        this.A04 = str;
        this.A00 = som;
        this.A01 = interfaceC65393TjQ;
        this.A03 = interfaceC65239TgV;
    }
}
