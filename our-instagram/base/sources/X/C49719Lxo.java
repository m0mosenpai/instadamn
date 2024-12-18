package X;

import com.facebook.mantle.common.mantledatavalue.MantleDataValue;
import com.facebook.mantle.ig.IGMantle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.Lxo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49719Lxo implements InterfaceC42241xE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImmutableMap A01;
    public final /* synthetic */ C41761wQ A02;
    public final /* synthetic */ C36921np A03;
    public final /* synthetic */ C15370ps A04;

    public C49719Lxo(ImmutableMap immutableMap, C41761wQ c41761wQ, C36921np c36921np, C15370ps c15370ps, int i) {
        this.A01 = immutableMap;
        this.A03 = c36921np;
        this.A00 = i;
        this.A04 = c15370ps;
        this.A02 = c41761wQ;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        ImmutableMap immutableMap = this.A01;
        C14360o3.A0A(immutableMap);
        try {
            ImmutableMap immutableMap2 = (ImmutableMap) ((IGMantle) obj).runMantleWithConfigStr("igd_nudity_detection", "{\"nodes\":{\"0\":{\"nodeType\":116,\"parents\":[],\"staticParams\":{\"11\":{\"boolean_val\":true}}},\"1\":{\"nodeType\":100,\"parents\":[0],\"staticParams\":{\"11\":{\"boolean_val\":true},\"25\":{\"int_val\":1}}}}}", immutableMap).get();
            if (immutableMap2 != null && immutableMap2.containsKey("predictions")) {
                C006802i c006802i = this.A03.A00;
                if (c006802i != null) {
                    c006802i.markerEnd(426181758, this.A00, (short) 2);
                    MantleDataValue mantleDataValue = (MantleDataValue) immutableMap2.get("predictions");
                    if (mantleDataValue != null && (mantleDataValue.value == null || mantleDataValue.type != EnumC129705ta.A08)) {
                        ImmutableList.of();
                    }
                    this.A04.A00 = new C206409Bx((String) null, immutableMap2, 11);
                    this.A02.A01();
                    return;
                }
            } else {
                C006802i c006802i2 = this.A03.A00;
                if (c006802i2 != null) {
                    c006802i2.markerEnd(426181758, this.A00, (short) 3);
                    this.A04.A00 = new C206409Bx("mantle_inference_failure", (Object) null, 11);
                    this.A02.A01();
                    return;
                }
            }
            C14360o3.A0F("qpl");
            throw C00O.createAndThrow();
        } catch (Exception e) {
            C006802i c006802i3 = this.A03.A00;
            if (c006802i3 == null) {
                C14360o3.A0F("qpl");
                throw C00O.createAndThrow();
            }
            c006802i3.markerEnd(426181758, this.A00, (short) 3);
            this.A04.A00 = new C206409Bx(AbstractC166997dE.A0y("mantle_exception", e), (Object) null, 11);
            this.A02.A01();
        }
    }
}
