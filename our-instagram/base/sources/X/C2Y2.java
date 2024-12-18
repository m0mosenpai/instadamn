package X;

import android.graphics.Rect;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.TestItem;
import com.facebook.rendercore.RenderTreeNode;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Y2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Y2 extends C2X7 {
    public C50882Vk A00;
    public final C51092Wf A01;
    public final Map A02;

    public C2Y2(C51092Wf c51092Wf) {
        C14360o3.A0B(c51092Wf, 1);
        this.A01 = c51092Wf;
        this.A02 = new HashMap();
    }

    @Override // X.C2X7
    public final /* bridge */ /* synthetic */ Object A0A() {
        return null;
    }

    @Override // X.C2X7
    public final /* bridge */ /* synthetic */ void A0B(Rect rect, C79073gE c79073gE, Object obj) {
        this.A00 = (C50882Vk) obj;
    }

    @Override // X.C2X7
    public final void A0C(C79073gE c79073gE) {
        C22902A7x c22902A7x;
        Object obj;
        Object obj2;
        Map map = this.A02;
        map.clear();
        C50882Vk c50882Vk = this.A00;
        if (c50882Vk != null) {
            List list = c50882Vk.A0R;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    List list2 = c50882Vk.A0R;
                    if (list2 != null && (c22902A7x = (C22902A7x) list2.get(i)) != null) {
                        long j = c22902A7x.A00;
                        TestItem testItem = new TestItem();
                        C50882Vk c50882Vk2 = this.A00;
                        ComponentHost componentHost = null;
                        if (c50882Vk2 != null) {
                            int i2 = 0;
                            int size2 = c50882Vk2.A0Q.size();
                            while (true) {
                                if (i2 >= size2) {
                                    break;
                                }
                                RenderTreeNode renderTreeNode = (RenderTreeNode) c50882Vk2.A0Q.get(i2);
                                if (renderTreeNode.A06.A0H() == c22902A7x.A00) {
                                    RenderTreeNode renderTreeNode2 = renderTreeNode.A05;
                                    if (renderTreeNode2 != null) {
                                        C3h4 c3h4 = (C3h4) this.A01.A06.A05(renderTreeNode2.A06.A0H());
                                        if (c3h4 != null) {
                                            obj2 = c3h4.A04;
                                        } else {
                                            obj2 = null;
                                        }
                                        componentHost = (ComponentHost) obj2;
                                    }
                                } else {
                                    i2++;
                                }
                            }
                        }
                        testItem.A00 = componentHost;
                        Rect rect = c22902A7x.A02;
                        C14360o3.A0B(rect, 0);
                        testItem.A03.set(rect);
                        testItem.A02 = c22902A7x.A01;
                        C3h4 c3h42 = (C3h4) this.A01.A06.A05(j);
                        if (c3h42 != null) {
                            obj = c3h42.A04;
                        } else {
                            obj = null;
                        }
                        testItem.A01 = obj;
                        Deque deque = (Deque) map.get(c22902A7x.A01);
                        if (deque == null) {
                            deque = new LinkedList();
                        }
                        deque.add(testItem);
                        map.put(c22902A7x.A01, deque);
                    }
                }
            }
        }
    }
}
