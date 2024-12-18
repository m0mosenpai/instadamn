package X;

import com.instagram.ui.text.TextColorScheme;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.8DV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8DV {
    public int A00;
    public int A01;
    public TextColorScheme A02;
    public TextColorScheme A03;
    public final Deque A04;
    public final List A05;

    public final void A00() {
        Deque deque = this.A04;
        Object poll = deque.poll();
        poll.getClass();
        TextColorScheme textColorScheme = (TextColorScheme) poll;
        deque.offer(textColorScheme);
        this.A02 = textColorScheme;
        this.A00 = (this.A00 + 1) % deque.size();
    }

    public final void A01() {
        if (this.A03 != null) {
            boolean z = false;
            if (this.A01 != -1) {
                z = true;
            }
            C18C.A0E(z);
            Deque deque = this.A04;
            deque.remove(this.A03);
            int i = this.A01;
            int i2 = this.A00;
            if (i <= i2) {
                this.A00 = ((i2 - 1) + deque.size()) % deque.size();
            }
            this.A01 = -1;
            this.A03 = null;
        }
    }

    public final void A02(int... iArr) {
        TextColorScheme textColorScheme = this.A02;
        textColorScheme.getClass();
        A01();
        if (iArr.length == 1) {
            int i = iArr[0];
            iArr = new int[]{i, i};
        }
        TextColorScheme A00 = textColorScheme.A00(iArr);
        this.A03 = A00;
        Deque deque = this.A04;
        deque.push(A00);
        this.A01 = (this.A00 + 1) % deque.size();
    }

    public C8DV(List list, int[] iArr, int i, int i2) {
        C18C.A0E(!list.isEmpty());
        this.A00 = -1;
        this.A03 = null;
        this.A01 = -1;
        this.A05 = list;
        this.A04 = new LinkedList();
        int size = i2 == 0 ? list.size() - 1 : i2 - 1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (i3 == i2) {
                TextColorScheme textColorScheme = (TextColorScheme) list.get(size);
                int i4 = iArr[0];
                TextColorScheme A00 = textColorScheme.A00(i4, i4);
                this.A03 = A00;
                this.A04.offer(A00);
                this.A01 = r0.size() - 1;
            }
            this.A04.offer(list.get(i3));
        }
        if (i2 == list.size()) {
            TextColorScheme textColorScheme2 = (TextColorScheme) list.get(size);
            int i5 = iArr[0];
            TextColorScheme A002 = textColorScheme2.A00(i5, i5);
            this.A03 = A002;
            this.A04.offer(A002);
            this.A01 = r0.size() - 1;
        }
        for (int i6 = 0; i6 < i; i6++) {
            Deque deque = this.A04;
            Object poll = deque.poll();
            poll.getClass();
            TextColorScheme textColorScheme3 = (TextColorScheme) poll;
            deque.offer(textColorScheme3);
            this.A02 = textColorScheme3;
            this.A00 = (this.A00 + 1) % deque.size();
        }
    }
}
