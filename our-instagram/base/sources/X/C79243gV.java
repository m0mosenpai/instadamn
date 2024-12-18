package X;

import com.facebook.rendercore.RenderTreeNode;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3gV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79243gV {
    public final int A00;
    public final long A01;
    public final C003501a A02;
    public final RenderTreeNode A03;
    public final List A04;
    public final RenderTreeNode[] A05;

    public C79243gV(C003501a c003501a, RenderTreeNode renderTreeNode, List list, RenderTreeNode[] renderTreeNodeArr, int i, long j) {
        C14360o3.A0B(renderTreeNodeArr, 2);
        this.A03 = renderTreeNode;
        this.A05 = renderTreeNodeArr;
        this.A01 = j;
        this.A00 = i;
        this.A04 = list;
        if (c003501a != null) {
            this.A02 = c003501a;
            return;
        }
        int length = renderTreeNodeArr.length;
        this.A02 = new C003501a(length);
        for (int i2 = 0; i2 < length; i2++) {
            C003501a c003501a2 = this.A02;
            RenderTreeNode[] renderTreeNodeArr2 = this.A05;
            RenderTreeNode renderTreeNode2 = renderTreeNodeArr2[i2];
            int intValue = ((Number) c003501a2.A06(renderTreeNode2.A06.A0H(), -1)).intValue();
            if (intValue == -1) {
                this.A02.A09(this.A05[i2].A06.A0H(), Integer.valueOf(i2));
            } else {
                RenderTreeNode renderTreeNode3 = renderTreeNodeArr2[intValue];
                long A0H = renderTreeNode2.A06.A0H();
                Locale locale = Locale.US;
                Integer valueOf = Integer.valueOf(i2);
                String A00 = renderTreeNode2.A00(null);
                Integer valueOf2 = Integer.valueOf(intValue);
                String A002 = renderTreeNode3.A00(null);
                StringBuilder sb = new StringBuilder();
                sb.append("RenderTree details:\n");
                String format = String.format(locale, "Full child list (size = %d):\n", Arrays.copyOf(new Object[]{Integer.valueOf(renderTreeNodeArr2.length)}, 1));
                C14360o3.A07(format);
                sb.append(format);
                for (RenderTreeNode renderTreeNode4 : renderTreeNodeArr2) {
                    String format2 = String.format(locale, "%s\n", Arrays.copyOf(new Object[]{renderTreeNode4.A00(this)}, 1));
                    C14360o3.A07(format2);
                    sb.append(format2);
                }
                String obj = sb.toString();
                C14360o3.A07(obj);
                String format3 = String.format(locale, "RenderTrees must not have RenderUnits with the same ID:\nAttempted to add item with existing ID at index %d: %s\nExisting item at index %d: %s\nFull RenderTree: %s", Arrays.copyOf(new Object[]{valueOf, A00, valueOf2, A002, obj}, 5));
                C14360o3.A07(format3);
                throw new C223579u0(A0H, format3);
            }
        }
    }

    public final int A00() {
        return this.A03.A03.height();
    }

    public final int A01() {
        return this.A03.A03.width();
    }
}
