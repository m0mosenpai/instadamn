package X;

import com.facebook.flipper.plugins.bloksdebugger.Event;
import com.facebook.flipper.plugins.bloksdebugger.Instruction;
import com.facebook.flipper.plugins.bloksdebugger.ScriptExecuted$Companion;
import com.facebook.flipper.plugins.bloksdebugger.ScriptStatus;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UMi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66551UMi extends Event {
    public final long A00;
    public final ScriptStatus A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public static final ScriptExecuted$Companion Companion = new Object();
    public static final C3R9[] A09 = {null, C3R7.A00("com.facebook.flipper.plugins.bloksdebugger.ScriptStatus", ScriptStatus.values()), null, new C3SG(C3RD.A01), new C3SG(new X6P("com.facebook.flipper.plugins.bloksdebugger.Instruction", new C0YZ(Instruction.class), new Annotation[0], new InterfaceC16510rw[]{new C0YZ(WVK.class), new C0YZ(WVL.class), new C0YZ(WVM.class), new C0YZ(WVO.class), new C0YZ(WVN.class), new C0YZ(WVP.class)}, new C3R9[]{C71710Wzb.A00, C71712Wzd.A00, C71713Wze.A00, C71715Wzg.A00, C71716Wzh.A00, C71718Wzj.A00})), null, null, null, null};

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C66551UMi(ScriptStatus scriptStatus, Object obj, Object obj2, @Serializable(with = C71699Wz8.class) String str, String str2, String str3, List list, @Serializable(with = C71699Wz8.class) List list2, int i, long j) {
        if (511 != (i & 511)) {
            AbstractC68612VXn.A00(C71717Wzi.A01, i, 511);
            throw C00O.createAndThrow();
        }
        this.A04 = str;
        this.A01 = scriptStatus;
        this.A03 = obj;
        this.A07 = list;
        this.A08 = list2;
        this.A06 = str2;
        this.A02 = obj2;
        this.A05 = str3;
        this.A00 = j;
    }
}
