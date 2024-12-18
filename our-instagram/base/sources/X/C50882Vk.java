package X;

import com.facebook.litho.ComponentsSystrace;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;

@Deprecated(message = "Marked for removal; check out D4182567 for context. ")
/* renamed from: X.2Vk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50882Vk implements InterfaceC50892Vl {
    public static final AtomicInteger A0e = new AtomicInteger(1);
    public C79443gr A00;
    public C79443gr A01;
    public C2W5 A02;
    public List A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public C79243gV A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final long A0D;
    public final C003501a A0E;
    public final C2WA A0F;
    public final C51282Xb A0G;
    public final C78373f3 A0H;
    public final C51272Xa A0I;
    public final C51272Xa A0J;
    public final C51302Xd A0K;
    public final C78303ew A0L;
    public final C1LL A0M = ComponentsSystrace.A00;
    public final ArrayList A0N;
    public final ArrayList A0O;
    public final List A0P;
    public final List A0Q;
    public final List A0R;
    public final List A0S;
    public final Map A0T;
    public final Map A0U;
    public final Map A0V;
    public final Map A0W;
    public final Map A0X;
    public final Map A0Y;
    public final java.util.Set A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final C003501a A0c;
    public final C2W1 A0d;

    @Override // X.InterfaceC50892Vl
    public final boolean Ca6() {
        return false;
    }

    public final int A00(long j) {
        Object A06 = this.A0c.A06(j, -1);
        if (A06 != null) {
            return ((Number) A06).intValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C79243gV A01() {
        C79243gV c79243gV = this.A07;
        if (c79243gV == null) {
            List list = this.A0Q;
            RenderTreeNode renderTreeNode = (RenderTreeNode) list.get(0);
            long A0H = renderTreeNode.A06.A0H();
            if (A0H == 0) {
                int size = list.size();
                RenderTreeNode[] renderTreeNodeArr = new RenderTreeNode[size];
                for (int i = 0; i < size; i++) {
                    renderTreeNodeArr[i] = list.get(i);
                }
                C79243gV c79243gV2 = new C79243gV(this.A0c, renderTreeNode, null, renderTreeNodeArr, this.A08, this.A0D);
                this.A07 = c79243gV2;
                return c79243gV2;
            }
            throw new IllegalStateException(AnonymousClass001.A0Q("Root render unit has invalid id ", A0H));
        }
        return c79243gV;
    }

    public final boolean A02(int i, int i2) {
        long j = this.A0D;
        boolean A00 = C51312Xe.A00(AbstractC78603fS.A01(j), i, this.A0C);
        boolean A002 = C51312Xe.A00(AbstractC78603fS.A00(j), i2, this.A09);
        if (A00 && A002) {
            return true;
        }
        return false;
    }

    public C50882Vk(C78863fs c78863fs, C78373f3 c78373f3, List list, Map map, int i, long j, boolean z) {
        this.A0H = c78373f3;
        this.A0D = j;
        this.A08 = i;
        this.A0b = z;
        this.A0X = map;
        this.A03 = list;
        this.A0E = c78863fs.A0I;
        this.A0c = c78863fs.A0J;
        this.A0W = c78863fs.A0X;
        this.A0O = c78863fs.A0P;
        this.A0N = c78863fs.A0O;
        this.A0R = c78863fs.A0S;
        this.A0K = c78863fs.A06;
        this.A0L = c78863fs.A07;
        this.A0d = c78863fs.A03;
        this.A0F = c78863fs.A02;
        this.A0Q = c78863fs.A0Q;
        this.A0U = c78863fs.A0V;
        this.A0T = c78863fs.A0U;
        this.A0C = c78863fs.A01;
        this.A09 = c78863fs.A00;
        this.A0A = c78863fs.A0C;
        this.A0B = c78863fs.A0D;
        this.A0I = c78863fs.A05;
        this.A0P = c78863fs.A09;
        this.A0a = c78863fs.A0A;
        this.A0G = c78863fs.A04;
        this.A0J = C2XY.A03(c78373f3.A03);
        this.A0Y = c78863fs.A0Y;
        this.A0S = c78863fs.A0T;
        this.A0Z = c78863fs.A0a;
        this.A0V = c78863fs.A0W;
        this.A04 = c78863fs.A0R;
        this.A02 = c78863fs.A08;
    }
}
