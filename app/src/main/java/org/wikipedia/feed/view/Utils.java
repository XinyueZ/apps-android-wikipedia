package org.wikipedia.feed.view;

import android.animation.AnimatorInflater;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.view.View;

import org.wikipedia.R;

import static android.os.Build.VERSION_CODES.LOLLIPOP;

public final class Utils {
	private Utils() {
	}

	@TargetApi(LOLLIPOP)
	public static void setStateListAnimator(@NonNull  View view) {
		if (Build.VERSION.SDK_INT >= LOLLIPOP) {
			Context cxt = view.getContext();
			view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(cxt, R.anim.selector_elevation));
		}
	}
}
