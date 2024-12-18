package com.instagram.debug.devoptions.signalsplayground.model;

import X.C14360o3;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class TestUserListItem {

    /* loaded from: classes5.dex */
    public final class TestUserHeader extends TestUserListItem {
        public final int titleRes;

        public final int component1() {
            return this.titleRes;
        }

        public final TestUserHeader copy(int i) {
            return new TestUserHeader(i);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof TestUserHeader) && this.titleRes == ((TestUserHeader) obj).titleRes);
        }

        public int hashCode() {
            return this.titleRes;
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ TestUserHeader copy$default(TestUserHeader testUserHeader, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = testUserHeader.titleRes;
            }
            return new TestUserHeader(i);
        }

        public TestUserHeader(int i) {
            this.titleRes = i;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }
    }

    /* loaded from: classes5.dex */
    public final class TestUserItem extends TestUserListItem {
        public final User user;

        public TestUserItem(User user) {
            C14360o3.A0B(user, 1);
            this.user = user;
        }

        public final User component1() {
            return this.user;
        }

        public final TestUserItem copy(User user) {
            C14360o3.A0B(user, 0);
            return new TestUserItem(user);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof TestUserItem) && C14360o3.A0K(this.user, ((TestUserItem) obj).user));
        }

        public int hashCode() {
            return this.user.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ TestUserItem copy$default(TestUserItem testUserItem, User user, int i, Object obj) {
            if ((i & 1) != 0) {
                user = testUserItem.user;
            }
            C14360o3.A0B(user, 0);
            return new TestUserItem(user);
        }

        public final User getUser() {
            return this.user;
        }
    }

    public /* synthetic */ TestUserListItem(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public TestUserListItem() {
    }
}
