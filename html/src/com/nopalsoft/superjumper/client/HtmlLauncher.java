package com.nopalsoft.superjumper.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.nopalsoft.superjumper.MainSuperJumper;
import com.nopalsoft.superjumper.handlers.FacebookHandler;
import com.nopalsoft.superjumper.handlers.GameServicesHandler;
import com.nopalsoft.superjumper.handlers.RequestHandler;

public class HtmlLauncher extends GwtApplication implements FacebookHandler, RequestHandler, GameServicesHandler {

    @Override
    public GwtApplicationConfiguration getConfig() {
        return new GwtApplicationConfiguration(480, 800);
    }

    @Override
    public ApplicationListener createApplicationListener() {
        return new MainSuperJumper(this, this, this);
    }

    @Override
    public void facebookSignIn() {

    }

    @Override
    public void facebookSignOut() {

    }

    @Override
    public boolean facebookIsSignedIn() {
        return false;
    }

    @Override
    public void facebookShareFeed(String message) {

    }

    @Override
    public void showFacebook() {

    }

    @Override
    public void facebookInviteFriends(String message) {

    }

    @Override
    public void submitScore(long score) {

    }

    @Override
    public void unlockAchievement(String achievementId) {

    }

    @Override
    public void getLeaderboard() {

    }

    @Override
    public void getAchievements() {

    }

    @Override
    public boolean isSignedIn() {
        return false;
    }

    @Override
    public void signIn() {

    }

    @Override
    public void signOut() {

    }

    @Override
    public void showRater() {

    }

    @Override
    public void showInterstitial() {

    }

    @Override
    public void showMoreGames() {

    }

    @Override
    public void shareOnTwitter(String mensaje) {

    }

    @Override
    public void removeAds() {

    }

    @Override
    public void showAdBanner() {

    }

    @Override
    public void hideAdBanner() {

    }

    @Override
    public void buy5milCoins() {

    }

    @Override
    public void buy15milCoins() {

    }

    @Override
    public void buy30milCoins() {

    }

    @Override
    public void buy50milCoins() {

    }
}